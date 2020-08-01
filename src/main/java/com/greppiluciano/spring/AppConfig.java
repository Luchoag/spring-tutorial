package com.greppiluciano.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.greppiluciano.beans.Barcelona;
import com.greppiluciano.beans.Camiseta;
import com.greppiluciano.beans.Jugador;
import com.greppiluciano.beans.Juventus;
import com.greppiluciano.beans.Marca;

@Configuration
public class AppConfig {

	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
