package com.gk.beans;

public class HelloBean1 {

	public static HelloBean1 getInstance() {
		System.out.println("Bean Instantiation Through Static Factory Mehtod!");
		return new HelloBean1();
	}
	
	public String sayHello() {
		return "Hi User! I called from Hellobean1(Static factory Method) class ";
	}
}
