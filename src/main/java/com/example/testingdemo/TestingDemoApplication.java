package com.example.testingdemo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestingDemoApplication.class, args);
		SpringApplication app = new SpringApplication(TestingDemoApplication.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8083"));
		        app.run(args);
	}
}
