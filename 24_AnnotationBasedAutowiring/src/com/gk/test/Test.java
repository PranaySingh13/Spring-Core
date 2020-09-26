package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Student1;
import com.gk.beans.Student2;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Student1 std1 = (Student1) context.getBean("studentBean1");
		std1.getStudentDetails();
		System.out.println();
		Student2 std2 = (Student2) context.getBean("studentBean2");
		std2.getStudentDetails();
		context.registerShutdownHook();
	}

}
