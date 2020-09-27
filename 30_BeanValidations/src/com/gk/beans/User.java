package com.gk.beans;

public class User {
	private String uid;
	private String uname;
	private String upwd;
	private int usal;
	private int uage;
	private String uemail;
	private String umobile;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public int getUsal() {
		return usal;
	}

	public void setUsal(int usal) {
		this.usal = usal;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}

	public void getUserDetails() {
		System.out.println("User Details");
		System.out.println("------------");
		System.out.println("User Id: " + uid);
		System.out.println("User Name: " + uname);
		System.out.println("User Passowrd: " + upwd);
		System.out.println("User Salary: " + usal);
		System.out.println("User Age: " + uage);
		System.out.println("User Email: " + uemail);
		System.out.println("User Mobile: " + umobile);
	}
}
