package com.gk.beans;

public class Student {

	private String sid;
	private String sname;
	private String saddr;
	private Course crs;

	public Student(String sid, String sname, String saddr, Course crs) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.crs = crs;
	}

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Student Id: " + sid);
		System.out.println("Student Name: " + sname);
		System.out.println("Student Address: " + saddr);
		System.out.println();
		crs.getCourseDetails();
	}
}
