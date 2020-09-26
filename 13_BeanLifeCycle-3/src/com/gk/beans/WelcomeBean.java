package com.gk.beans;

public class WelcomeBean {

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
		System.out.println("Default WelcomeBean Initialization");
	}

	public void destroy() {
		System.out.println("Default WelcomeBean Destruction");
	}
	
	public String sayWelcome() {
		return name+" "+message;
	}
}
