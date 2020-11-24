package com.example.firstcrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class FirstCrudApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstCrudApp3Application.class, args);
	}

}
