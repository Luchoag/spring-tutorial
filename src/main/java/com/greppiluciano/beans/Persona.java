package com.greppiluciano.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	/* Se borran los default-init-method y default-destroy-method y se agregan las annotations para que automáticamente se ejecuten esos métodos.
	 * 
	 */
	@PostConstruct
	private void init() {
		System.out.println("Antes de inicializar el bean.");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Bean a punto de ser destruido.");
	}
	
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	


	
	
	
	
	
}
