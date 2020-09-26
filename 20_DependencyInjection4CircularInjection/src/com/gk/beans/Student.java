package com.gk.beans;

public class Student {

	Branch branch;
	//Circular Injection through contructors is not supported by Spring
	/*
	public Student(Branch branch) {
		super();
		this.branch = branch;
	}
	*/
	
	public String getStudentName() {
		return "Pranay Singh";
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
}
