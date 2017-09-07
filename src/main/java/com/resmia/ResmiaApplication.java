package com.resmia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.resmia.*")
public class ResmiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResmiaApplication.class, args);
	}
}
