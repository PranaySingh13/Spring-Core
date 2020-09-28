package com.gk.beans;

public class User {

	private String uname;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String hello() {
		return "Hello "+uname+" !";
	}
}
