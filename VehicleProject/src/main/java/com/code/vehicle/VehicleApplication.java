package com.code.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.code.vehicle.repository")
@SpringBootApplication
public class VehicleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(VehicleApplication.class, args);
		
	}
}
