package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.HelloBean;
import com.gk.beans.WelcomeBean;
import com.gk.beans.WishBean;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		
		WishBean whb=(WishBean) context.getBean("wishbean");
		System.out.println(whb.wish());
		
		HelloBean hb=(HelloBean) context.getBean("hellobean");
		System.out.println(hb.sayHello());
		
		WelcomeBean wcb=(WelcomeBean) context.getBean("welcomebean");
		System.out.println(wcb.sayWelcome());
		
		context.registerShutdownHook();
		
	}

}
