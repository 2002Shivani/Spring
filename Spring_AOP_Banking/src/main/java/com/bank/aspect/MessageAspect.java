package com.bank.aspect;

import java.util.Scanner;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {
	
	@Before("execution (public void tranMethod())")
	public void beforeTransaction() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Pin:");
		int pin = in.nextInt();
	}

	@After("execution (public void tranMethod())")
	public void afterTransaction() {
		Scanner in = new Scanner(System.in);
		System.out.println("Transaction Done");
	}
}
