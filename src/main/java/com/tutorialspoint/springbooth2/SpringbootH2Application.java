package com.tutorialspoint.springbooth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.tutorialspoint.controller","com.tutorialspoint.service"})
@EntityScan("com.tutorialspoint.entity")
@EnableJpaRepositories("com.tutorialspoint.repository")
@SpringBootApplication

public class SpringbootH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2Application.class, args);
	}

}
