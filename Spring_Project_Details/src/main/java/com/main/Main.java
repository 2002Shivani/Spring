package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entities.ProjectEmployee;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
	    ProjectEmployee emp =	context.getBean(ProjectEmployee.class);
		System.out.println("Employee Data and Related Project\n"+emp);

	}

}
