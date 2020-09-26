package com.gk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student2 {

	private String sId;
	private String sName;
	private Course sCourse;
	
	/*
	 * This Annotations will be used at method level, field level and local variables level 
	 * in constructor dependency injection except @Required .
	 */
	@Autowired
	public Student2(String sId, String sName, @Qualifier(value = "course2")Course sCourse) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCourse = sCourse;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Student Id: "+sId);
		System.out.println("Student Name: "+sName);
		System.out.println("Course Details");
		System.out.println("--------------");
		System.out.println("Course Id: "+sCourse.getcId());
		System.out.println("Course Name: "+sCourse.getcName());
		System.out.println("Course Cost: "+sCourse.getcCost());
	}
	
}
