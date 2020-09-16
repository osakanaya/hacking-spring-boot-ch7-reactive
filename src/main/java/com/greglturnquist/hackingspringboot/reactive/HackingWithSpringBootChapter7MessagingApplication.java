package com.greglturnquist.hackingspringboot.reactive;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HackingWithSpringBootChapter7MessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackingWithSpringBootChapter7MessagingApplication.class, args);
	}
	
	@Bean
	Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

}
