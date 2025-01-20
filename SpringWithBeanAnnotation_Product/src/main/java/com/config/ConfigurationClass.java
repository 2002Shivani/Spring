package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entities.ProductDetails;
import com.entities.ProductSelling;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public ProductDetails product() {
		return new ProductDetails();
	}
	
	@Bean
	public ProductSelling sale() {
		return new ProductSelling();
	}

}
