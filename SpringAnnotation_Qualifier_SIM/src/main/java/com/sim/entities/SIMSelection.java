package com.sim.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sim.interfaceP.CallingFunctionality;

@Component
public class SIMSelection {

	@Qualifier("airtel")
	@Autowired
	CallingFunctionality sim1;
	
	@Qualifier("jio")
	@Autowired
	CallingFunctionality sim2;

	public CallingFunctionality getSim1() {
		return sim1;
	}

	public void setSim1(CallingFunctionality sim1) {
		this.sim1 = sim1;
	}

	public CallingFunctionality getSim2() {
		return sim2;
	}

	public void setSim2(CallingFunctionality sim2) {
		this.sim2 = sim2;
	}

	
	
	
}
