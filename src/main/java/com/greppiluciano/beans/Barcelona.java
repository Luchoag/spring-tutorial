package com.greppiluciano.beans;

import org.springframework.stereotype.Component;

import com.greppiluciano.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	public String mostrar() {
		return "Barcelona FC";
	}

}
