package com.sim.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sim.interfaceP.CallingFunctionality;

@Component("jio")
public class Jio implements CallingFunctionality {

	@Override
	public String calling() {
		return "Calling from Jio";
		
	}

}
