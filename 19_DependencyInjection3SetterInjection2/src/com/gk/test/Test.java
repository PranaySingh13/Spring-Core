package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Student;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Student stdBean=(Student) context.getBean("studentBean");
		stdBean.getStudentDetails();
	
	}

}
