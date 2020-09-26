package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Course;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Course crs=(Course)context.getBean("course");
		crs.getCourseDetails();
	}

}
