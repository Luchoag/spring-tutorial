package com.greppiluciano.beans;

import org.springframework.stereotype.Component;

import com.greppiluciano.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo{

	public String mostrar() {
		return "Juventus";
	}

}
