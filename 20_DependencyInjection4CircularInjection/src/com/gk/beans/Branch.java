package com.gk.beans;

public class Branch {

	Student student;
	//Circular Injection through contructors is not supported by Spring
	/*
	public Branch(Student student) {
		super();
		this.student=student;
	}
	*/
	
	public String getBranchName() {
		return "Computer Science";
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
