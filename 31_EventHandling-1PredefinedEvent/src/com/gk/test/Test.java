package com.gk.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.User;

public class Test {

	public static void main(String[] args) {
		//Child Interface of ApplicationContext to perform Event Handling in spring applications. 
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		User user=(User)context.getBean("userBean");
		System.out.println(user.hello());
		
		//Predefined Events
		context.refresh();
		context.start();
		context.stop();
		context.close();
	}

}
