package com.recharge.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"com.recharge"})
@EnableAspectJAutoProxy
public class MyConfiguration {

}
