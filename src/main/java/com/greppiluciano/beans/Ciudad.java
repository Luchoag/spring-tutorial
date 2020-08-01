package com.greppiluciano.beans;

public class Ciudad {
	
	private String nombre;
	
	private void init() {
		System.out.println("Antes de inicializar el bean.");
	}
	
	private void destroy() {
		System.out.println("Bean a punto de ser destruido.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
