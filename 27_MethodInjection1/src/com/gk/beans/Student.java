package com.gk.beans;

public class Student {

	private String sid;
	private String sname;
	private String saddr;
	private Course scourse;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public Course getScourse() {
		return scourse;
	}

	public void setScourse(Course scourse) {
		this.scourse = scourse;
	}

	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Student Id: " + sid);
		System.out.println("Student Name: " + sname);
		System.out.println("Student Address: " + saddr);
		System.out.println();
		System.out.println("Course Details");
		System.out.println("--------------");
		System.out.println("Course Id: " + scourse.getCid());
		System.out.println("Course Name: " + scourse.getCname());
		System.out.println("Course Cost: " + scourse.getCcost());
	}

}
