package com.gk.beans;

public class Employee {

	static {
		System.out.println("Bean Loading");
	}

	public Employee() {
		super();
		System.out.println("Bean Created");
	}

	public String sayHello() {
		return "Hi!";
	}
}
