package com.gk.beans;

public class HelloBean {

	public HelloBean() {
		System.out.println("HelloBean Object is created");
	}

	public String sayHello() {
		return "Hello user from "+Thread.currentThread().getName()+" Scope";
	}
}
