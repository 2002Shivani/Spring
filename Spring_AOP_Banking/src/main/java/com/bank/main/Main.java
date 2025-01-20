package com.bank.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.config.BankConfiguration;
import com.bank.entities.BankingTransaction;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(BankConfiguration.class);
		BankingTransaction bank = context.getBean(BankingTransaction.class);
		bank.tranMethod();
		
	}

}
