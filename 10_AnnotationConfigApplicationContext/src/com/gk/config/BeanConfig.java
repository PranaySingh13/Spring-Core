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
	
	
	/*
	 *This methodName we have to provide in the argument of context.getBean() for
	 * getting respective bean objects at main application.
	 */
	@Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}
	
	/*
	 *This methodName we have to provide in the argument of context.getBean() for
	 * getting respective bean objects at main application.
	 */
	@Bean
	public WelcomeBean welcomeBean() {
		WelcomeBean wb=new WelcomeBean();
		wb.setName("Pranay");
		return wb;
	}
}
