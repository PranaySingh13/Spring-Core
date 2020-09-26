package com.gk.beans;

public class HelloBean {

	public HelloBean() {
	System.out.println("Bean Instantiation Through Construtor!");
	}
	
	public String sayHello() {
		return "Hi User! I called from Hellobean(Constructor) class";
	}
	
}
