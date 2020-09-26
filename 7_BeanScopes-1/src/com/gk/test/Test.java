package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Employee e1 = (Employee) factory.getBean("empbean1");
		System.out.println(e1.sayHello());
		Employee e2 = (Employee) factory.getBean("empbean2");
		System.out.println(e2.sayHello());
		Employee e3 = (Employee) factory.getBean("empbean2");
		System.out.println(e2.sayHello());

		System.out.println(e1);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}

}
