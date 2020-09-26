package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Employee e = (Employee) factory.getBean("empbean");
		System.out.println(e.sayHello());
	}

}
