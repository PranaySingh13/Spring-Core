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
	public void init() {
		System.out.println("Default WishBean Initialization");
	}

	public void destroy() {
		System.out.println("Default WishBean Destruction");
	}
	
	/*
	 * Local init and destroy
	 */
	public void localInit() {
		System.out.println("Local WishBean Initialization");
		name="Kailash";
		message="Singh";
	}
	public void localDestroy() {
		System.out.println("Local WishBean Destruction");
	}
	
	public String sayWish() {
		return name+" "+message;
	}

}
