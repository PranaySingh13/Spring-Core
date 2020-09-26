package com.gk.beans;

public class Course {

	private int courseId;
	private String courseName;
	private float courseCost;
	
	
	public Course() {
		super();
	System.out.println("0-arg Constructor");
	}
	public Course(int courseId) {
		super();
		System.out.println("1-arg Constructor");
		this.courseId = courseId;
	}
	public Course(int courseId, String courseName) {
		super();
		System.out.println("2-arg Constructor");
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public Course(int courseId, String courseName, float courseCost) {
		super();
		System.out.println("3-arg Constructor");
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCost = courseCost;
	}
	
	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("--------------");
		System.out.println("Course Id: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Cost: Rs" + courseCost + "/- Only");
	}
}
