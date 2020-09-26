package com.gk.beans;

public class HelloBean {

	private String name;
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.out.println("Default HelloBean Initialization");
	}

	public void destroy() {
		System.out.println("Default HelloBean Destruction");
	}
	
	public String sayHello() {
		return name+" "+message;
	}
}
