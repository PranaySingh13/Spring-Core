package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Employee;
import com.gk.beans.Student;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Employee emp = (Employee) context.getBean("empBean");
		emp.getEmployeeDetails();
		System.out.println();
		Student std = (Student) context.getBean("stdBean");
		std.getStudentDetails();
		context.registerShutdownHook();

	}

}
