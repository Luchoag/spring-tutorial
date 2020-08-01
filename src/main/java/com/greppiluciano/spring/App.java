package com.greppiluciano.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greppiluciano.beans.AppConfig;
import com.greppiluciano.beans.AppConfig2;
import com.greppiluciano.beans.Ciudad;
import com.greppiluciano.beans.Mundo;
import com.greppiluciano.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/greppiluciano/xml/beans.xml");
		//AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		//appContext.register(AppConfig.class);
		//appContext.register(AppConfig2.class);
		//appContext.refresh();
		
		Persona per = (Persona) appContext.getBean("persona");
		Persona per2 = (Persona) appContext.getBean("persona");
		
		/*
		 * Con Singleton en el scope del Bean, estas propiedades se asignan a las dos instancias, ya que en
		 * realidad es una sola.
		 * Con Prototype en el scope del Bean, se asignan sólo a la instancia referenciada. 
		 */
		per.setId(1);
		per.setNombre("Luciano");
		per.setApodo("Lucho");		
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + per.getCiudad().getNombre());
		System.out.println(per2.getId() + " " + per2.getNombre() + " " + per2.getApodo() + " " + per2.getPais().getNombre() + " " + per2.getCiudad().getNombre());
		
		// Con Singleton en el "Scope" del Bean, los objetos tienen el mismo id
		// Con Prototype en el "Scope" del Bean, los objetos tienen distinto id
		//System.out.println(per);
		//System.out.println(per2);		
		
		
		// Cierra el appContext
		((ConfigurableApplicationContext)appContext).close();
		
		
		
	}

}
