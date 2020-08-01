/*
 * @Luciano Greppi, 2020
 * Este proyecto fue realizado siguiendo los tutoriales de MitoCode disponibles en: https://www.youtube.com/playlist?list=PLvimn1Ins-40CImsffjCkv_TrKzYiB1gb
 * Cada commit, representa un video-tutorial distinto y contiene mis apuntes y comentarios sobre los temas para facilitar el entendimiento de ellos en el futuro.  
 */

package com.greppiluciano.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greppiluciano.beans.AppConfig;
import com.greppiluciano.beans.AppConfig2;
import com.greppiluciano.beans.Barcelona;
import com.greppiluciano.beans.Ciudad;
import com.greppiluciano.beans.Jugador;
import com.greppiluciano.beans.Mundo;
import com.greppiluciano.beans.Persona;
import com.greppiluciano.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/greppiluciano/xml/beans.xml");
		
		
		Jugador jug = (Jugador) appContext.getBean("messi");

		System.out.println(jug.getNombre() + " - " + jug.getEquipo().mostrar());
		
		// Cierra el appContext
		((ConfigurableApplicationContext)appContext).close();
		
		
		
	}

}
