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
	
	public String sayHello() {
		return "Hi ! "+name+" "+message+"";
	}
	
	public void init() {
		System.out.println("HelloBean Initialization");
	}
	public void destroy() {
		System.out.println("HelloBean Destruction");
	}
}
