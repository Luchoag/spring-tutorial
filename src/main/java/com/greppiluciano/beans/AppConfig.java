package com.greppiluciano.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Mundo mundo() {
		return new Mundo();
	}
	
}
