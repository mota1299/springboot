package com.example.practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.practica", "com.example.practica.exception"})
public class PracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaApplication.class, args);
	}

}
