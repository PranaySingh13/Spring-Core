package com.gk.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean2 implements InitializingBean, DisposableBean {
	
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Initializating FirstName through setFirstName() method!");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("Initializating LastName through setLastName() method!");
		this.lastName = lastName;
	}

	public String sayHello() {

		return "Hello ! " + firstName + " " + lastName + "";
	}

	/*
	 * Bean Initialization through InitializingBean and DisposableBean
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initializating FirstName and LastName through afterPropertiesSet() method!");
		firstName="Kailash";
		lastName="Sherawat";
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Deinitializating FirstName and LastName through DisposableBean interface overridden destroy() method!");
	}
}
