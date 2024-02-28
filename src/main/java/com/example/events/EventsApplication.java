package com.example.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsApplication.class, args);
	}

}
