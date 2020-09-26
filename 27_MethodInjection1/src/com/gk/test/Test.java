package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Student student1 = (Student) context.getBean("studentBean");
		student1.getStudentDetails();
		Student student2 = (Student) context.getBean("studentBean");
		student2.getStudentDetails();
		System.out.println(student1);
		System.out.println(student2);
		System.out.println();
		System.out.println(student1.getScourse());
		System.out.println(student2.getScourse());
		/*
		 * As per singleton scope of student single bean object should be created.
		 * and as per prototype scope of course multiple bean object should be created.
		 * But here we don't get the multiple course objects so it is violating the
		 * rules of Spring. To resolve this issue we have solution of "Method Injection".
		 */
	}

}
