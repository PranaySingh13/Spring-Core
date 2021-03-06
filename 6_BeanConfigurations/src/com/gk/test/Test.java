package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Employee e1 = (Employee) factory.getBean("empbean");
		System.out.println(e1.sayHello());
		Employee e2 = (Employee) factory.getBean("empbeanname");
		System.out.println(e2.sayHello());
		Employee e3 = (Employee) factory.getBean("empbeanname1");
		System.out.println(e3.sayHello());
		Employee e4 = (Employee) factory.getBean("empbeanname2");
		System.out.println(e4.sayHello());

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}

}
