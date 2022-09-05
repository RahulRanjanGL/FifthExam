package com.swagger.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSwaggerWithRestfulServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwaggerWithRestfulServicesApplication.class, args);
		System.out.println("Swagger App Server Started...");
	}

}
