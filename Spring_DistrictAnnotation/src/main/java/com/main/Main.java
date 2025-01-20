package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigurationClass;
import com.entity.DistrictDetails;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		DistrictDetails d = context.getBean(DistrictDetails.class);
		d.setDistrictName("Jalgaon");
		d.setDistrictNH(1);
		d.setDistrictState("Maharashtra");
		System.out.println(d);
		
	}
}
