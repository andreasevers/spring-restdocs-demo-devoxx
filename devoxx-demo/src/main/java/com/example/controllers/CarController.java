package com.example.controllers;

import static java.util.Arrays.asList;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Car;

@RestController
@RequestMapping(value = "/cars", produces = "application/json")
public class CarController {

	@RequestMapping("/{id}")
	public ResponseEntity<Car> getCar(@PathVariable("id") long id) {
		Car car = retrieveCar(id);
		return new ResponseEntity<Car>(car, OK);
	}
	
	@RequestMapping
	public ResponseEntity<Resources<Car>> getCars() {
		Car car = retrieveCar(1);
		Resources<Car> carsResource = new Resources<Car>(asList(car));
		carsResource.add(linkTo(CarController.class).withSelfRel());
		return new ResponseEntity<Resources<Car>>(carsResource, OK);
	}

	private Car retrieveCar(long id) {
		Car car = new Car(id, "BMW");
		car.add(linkTo(CarController.class).slash(id).withSelfRel());
		return car;
	}
}
