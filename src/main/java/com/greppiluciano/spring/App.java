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
		
		Persona per = (Persona) appContext.getBean("personaBean2");
		
		String nombresCiudades = "";
		
		for (Ciudad ciu : per.getPais().getCiudades()) {
			nombresCiudades += ciu.getNombre() + "-";
		}
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre() + " " + nombresCiudades);
		
		// Cierra el appContext
		((ConfigurableApplicationContext)appContext).close();
		
		
		
	}

}
