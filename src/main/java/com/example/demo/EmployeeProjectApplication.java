package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class EmployeeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
		System.out.println("server started successfull");
	}
}