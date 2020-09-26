package com.gk.beans;

public class WishBean {

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
	public String wish() {
		return "Hello ! "+name+" "+message+"";
	}
	
	public void init() {
		System.out.println("WishBean Initialization");
	}
	public void destroy() {
		System.out.println("WishBean Destruction");
	}
	
}
