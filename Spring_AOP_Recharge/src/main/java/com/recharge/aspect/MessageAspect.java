package com.recharge.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MessageAspect {

	@Around("execution (* com.recharge.entities.RechargeNotification.*())")
	
	public void aroundAspect(ProceedingJoinPoint pj){
		
		System.out.println("Your Recharge is expiring soon please recharge \nwith 299rs pack with unlimited calls ,\n2GB data a day");
		try {
			pj.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		
		}
		
		System.out.println("Recharge Successful , Enjoy your  pack with unlimited calls ,\n2GB data a day");
	}
}
