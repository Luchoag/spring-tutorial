package com.greppiluciano.beans;

import org.springframework.beans.factory.annotation.Required;

import com.greppiluciano.interfaces.IEquipo;

public class Jugador {

	private int numero;
	private String nombre;
	private IEquipo equipo;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	
	@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	/*
	 * Al incluir la anotación Required y el bean correspondiente en beans.xml, si no se completa el campo requerido, el programa arroja una excepción
	 * en la que indica cuál es el error cometido. Si no se agrega el bean RequiredAnnotationBeanPostProcessor, también arroja excepción pero al no
	 * reconocer la anotación, no especifica cuál ha sido el error.
	 */
	
	
}
