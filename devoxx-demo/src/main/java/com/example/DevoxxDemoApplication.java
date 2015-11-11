package com.example;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableHypermediaSupport(type = HAL)
public class DevoxxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevoxxDemoApplication.class, args);
    }
}
