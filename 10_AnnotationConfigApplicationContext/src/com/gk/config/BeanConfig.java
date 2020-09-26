package com.gk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gk.beans.HelloBean;
import com.gk.beans.WelcomeBean;

@Configuration
public class BeanConfig {

	static {
		System.out.println("Bean Class Loading.........");
	}
	
	public BeanConfig() {
		System.out.println("Bean Class Instantiated......");
	}
	
	@Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}
	
	@Bean
	public WelcomeBean welcomeBean() {
		WelcomeBean wb=new WelcomeBean();
		wb.setName("Pranay");
		return wb;
	}
}
