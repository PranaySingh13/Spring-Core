package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Employee empBean=(Employee) context.getBean("emp");
		empBean.getEmployeeDetails();
		context.registerShutdownHook();
	}

}
