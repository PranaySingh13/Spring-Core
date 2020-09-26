package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Employee1;
import com.gk.beans.Employee2;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Employee1 emp1=(Employee1) context.getBean("empBean1");
		emp1.getEmployee1Details();
		System.out.println();
		Employee2 emp2=(Employee2) context.getBean("empBean2");
		emp2.getEmployee2Details();
		context.registerShutdownHook();
	}
}
