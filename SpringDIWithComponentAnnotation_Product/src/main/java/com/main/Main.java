package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigurationClass;
import com.entities.ProductDetails;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		ProductDetails product = context.getBean("product",ProductDetails.class);
		System.out.println(product);
	}
}
