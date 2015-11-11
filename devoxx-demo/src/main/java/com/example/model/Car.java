package com.example.model;

import org.springframework.hateoas.ResourceSupport;

public class Car extends ResourceSupport {
	
	private long id;
	
	private String brand;
	
	public Car() {}
	
	public Car(long id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
