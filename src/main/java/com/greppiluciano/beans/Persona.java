package com.greppiluciano.beans;

public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	
	/*
	 * En beans.xml agregamos las propiedades init-method y destroy-method, las cuales se ejecutan antes y después de inicializar el bean respectivamente.
	 * Si en App.java no cerramos el appContext, el destroy-method nunca se ejecuta.
	 * Los nombres de los métodos init() y destroy() son indistintos, lo importante es hacer referencia a ellos correctamente en beans.xml.  
	 */
	private void init() {
		System.out.println("Antes de inicializar el bean.");
	}
	
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
