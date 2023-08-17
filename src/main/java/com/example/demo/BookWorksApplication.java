package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.example.*")
@EntityScan(basePackages = "com.example.*")
@EnableJpaRepositories(basePackages="com.example.*")
@SpringBootApplication
public class BookWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookWorksApplication.class, args);
	}

}
