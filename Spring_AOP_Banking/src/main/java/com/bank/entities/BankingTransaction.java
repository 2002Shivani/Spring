package com.bank.entities;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class BankingTransaction {

	public void tranMethod() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter money:");
		int money = in.nextInt();
		System.out.println("Transaction processing....");
	}
}
