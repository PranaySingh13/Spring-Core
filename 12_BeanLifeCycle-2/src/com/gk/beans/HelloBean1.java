package com.gk.beans;

public class HelloBean1 {

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
	 * Bean Initialization through Custom Initialization and destruction Methods
	 */
	public void init() {
		System.out.println("Initializating FirstName and LastName through init() method!");
		firstName = "Apoorva";
		lastName = "Bhadoria";
	}

	public void destroy() {
		System.out.println("Deinitializating FirstName and LastName through destroy() method!");
		firstName = "";
		lastName = "";
	}

}
