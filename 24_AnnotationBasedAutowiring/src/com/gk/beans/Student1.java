package com.gk.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/*We can't use the autowire annotation at class level*/
public class Student1 {

	private String sId;
	private String sName;
	private Course sCourse;
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Course getsCourse() {
		return sCourse;
	}
	/*
	@Required //It reflects that autowiring is mandatory for this object. And It can be apply only just before setter methods.
	@Autowired //Internally this annotation is following byType autowiring.
	public void setsCourse(Course sCourse) {
		this.sCourse = sCourse;
	}
	
	//Above and Below both ways are same and valid for single bean type autowiring. 
	
	@Autowired(required = true)
	public void setsCourse(Course sCourse) {
		this.sCourse = sCourse;
	}
	*/
	@Required
	@Autowired
	@Qualifier(value = "course1")
	/*To Resolve NoUniqueBeanException, It will be used to specify
	  a particular bean object among the multiple beans of the same type for injection.*/ 
	public void setsCourse(Course sCourse) {
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
