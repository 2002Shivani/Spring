package com.recharge.entities;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class RechargeNotification {
	
	public void rechargeNotify() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Recharge Pack:");
		int pack = in.nextInt();
	}

}
