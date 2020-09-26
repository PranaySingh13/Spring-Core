package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Branch;
import com.gk.beans.Student;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Student std = (Student) context.getBean("studentBean");
		System.out.println("Student Name: "+std.getStudentName());
		Branch br = (Branch) context.getBean("branchBean");
		System.out.println("Branch Name: "+br.getBranchName());
		context.registerShutdownHook();

	}

}
