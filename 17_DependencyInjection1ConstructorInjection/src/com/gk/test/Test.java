package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Course;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");

		Course crs1 = (Course) context.getBean("course1");
		crs1.getCourseDetails();
		System.out.println("**********");
		Course crs2 = (Course) context.getBean("course2");
		crs2.getCourseDetails();
		System.out.println("**********");
		Course crs3 = (Course) context.getBean("course3");
		crs3.getCourseDetails();
		System.out.println("**********");
		Course crs4 = (Course) context.getBean("course4");
		crs4.getCourseDetails();
		System.out.println("**********");
		Course crs5 = (Course) context.getBean("course5");
		crs5.getCourseDetails();

		context.registerShutdownHook();
	}
}
