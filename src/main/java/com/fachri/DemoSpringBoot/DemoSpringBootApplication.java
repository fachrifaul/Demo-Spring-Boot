package com.fachri.DemoSpringBoot;

import com.fachri.DemoSpringBoot.entity.Car;
import com.fachri.DemoSpringBoot.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.Basic;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(CarRepository carRepository) {
//		return (args) -> {
//			carRepository.save(new Car("Toyota", "Sedan", "Avanza", "Hitam", "Pertamax", 2016));
//			carRepository.save(new Car("Toyota", "Sedan", "Avanza", "Hitam", "Pertamax", 2017));
//		};
//	}


}
