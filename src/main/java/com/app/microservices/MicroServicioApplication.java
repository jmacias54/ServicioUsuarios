package com.app.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MicroServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicioApplication.class, args);
	}

}

