package com.gk.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloBean3 {

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
	 * Bean Initialization through @PostConstruct and @PreDestory
	 */
	@PostConstruct
	public void init() {
		System.out.println("Initializating FirstName and LastName through @PostContruct Annotation applied init method!");
		firstName="Gayatri";
		lastName="Singh";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Deinitializating FirstName and LastName through @Predestroy Annotation applied destroy method!");
	}
	

}
