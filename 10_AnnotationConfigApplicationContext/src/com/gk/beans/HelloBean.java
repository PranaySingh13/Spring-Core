package com.gk.beans;

public class HelloBean {

	static {
		System.out.println("Bean Loading.......");
	}

	public HelloBean() {
		System.out.println("Bean Created......");
	}
	
	public String sayHello() {
		return "Hello User!";
	} 

}
