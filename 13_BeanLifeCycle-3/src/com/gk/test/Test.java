package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.HelloBean;
import com.gk.beans.WelcomeBean;
import com.gk.beans.WishBean;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");

		WishBean bean2 = (WishBean) context.getBean("wishbean");
		System.out.println(bean2.sayWish());

		HelloBean bean1 = (HelloBean) context.getBean("hellobean");
		System.out.println(bean1.sayHello());

		WelcomeBean bean3 = (WelcomeBean) context.getBean("welcomebean");
		System.out.println(bean3.sayWelcome());

		context.registerShutdownHook();

	}

}
