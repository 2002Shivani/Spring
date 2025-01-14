package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.StudentRegister;

public class Main {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		StudentRegister register =  context.getBean(StudentRegister.class);
		System.out.println("Data Is \n"+register);

	}

}
