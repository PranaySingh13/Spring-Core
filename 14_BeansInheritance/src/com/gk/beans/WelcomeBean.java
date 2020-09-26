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
	
	public String sayWelcome() {
		return "Hey ! "+name+" "+message+"";
	}
	public void init() {
		System.out.println("WelcomeBean Initialization");
	}
	public void destroy() {
		System.out.println("WelcomeBean Destruction");
	}
}
