package com.greppiluciano.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;


public class Persona implements InitializingBean, DisposableBean {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	/* 
	@PostConstruct
	private void init() {
		System.out.println("Antes de inicializar el bean.");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Bean a punto de ser destruido.");
	}
	*/
	
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

	public void afterPropertiesSet() throws Exception {
		System.out.println("AFTER PERSONA");
		
	}

	public void destroy() throws Exception {
		System.out.println("DESTROY PERSONA");
		
	}
	


	
	
	
	
	
}
