package com.greppiluciano.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.greppiluciano.interfaces.IEquipo;

public class Jugador {

	private int numero;
	private String nombre;
	@Autowired
	@Qualifier("barcelonaQualifier")
	private IEquipo equipo;
	
	/*
	 * Se agrega la anotación Autowired para que haga el "cableado" automáticamente a la propiedad que corresponde. Si hay más de una propiedad del mismo tipo
	 * (como en este caso, Barcelona y Juventus, ambos equipos), se agrega el Qualifier para que el programa sepa a cuál de los dos beans se hace referencia. 
	 */
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	@Required
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	//@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

	
	
}
