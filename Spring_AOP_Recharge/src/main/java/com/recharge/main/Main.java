package com.recharge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.recharge.config.MyConfiguration;
import com.recharge.entities.RechargeNotification;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		RechargeNotification recharge = context.getBean(RechargeNotification.class);
		recharge.rechargeNotify();
		
	}

}
