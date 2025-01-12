package com.example.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
@EnableJpaRepositories("com.example.Repository")
@EntityScan("com.example.Models")   
public class portfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(portfolioApplication.class, args);
	}

}
