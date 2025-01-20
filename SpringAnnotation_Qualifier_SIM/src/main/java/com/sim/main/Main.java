package com.sim.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sim.config.MyConfiguration;
import com.sim.entities.SIMSelection;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		SIMSelection call = context.getBean(SIMSelection.class);
		System.out.println(call.getSim1().calling());
		System.out.println(call.getSim2().calling());
	}

}
