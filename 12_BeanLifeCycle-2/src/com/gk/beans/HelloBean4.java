package com.gk.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * For Testing the order of bean Initializing and destruction if all
 * three initializing and destruction methods are applied at same time 
 */
public class HelloBean4 implements InitializingBean, DisposableBean{
	
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
	public void initOfCustom() {
		System.out.println("Initializating FirstName and LastName through init() method!");
		firstName = "Apoorva";
		lastName = "Bhadoria";
	}

	public void destroyOfCustom() {
		System.out.println("Deinitializating FirstName and LastName through destroy() method!");
		firstName = "";
		lastName = "";
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
	
	/*
	 * Bean Initialization through @PostConstruct and @PreDestory
	 */
	@PostConstruct
	public void initOfPostConstruct() {
		System.out.println("Initializating FirstName and LastName through @PostContruct Annotation applied init method!");
		firstName="Gayatri";
		lastName="Singh";
	}
	
	@PreDestroy
	public void destroyOfPreDestroy() {
		System.out.println("Deinitializating FirstName and LastName through @Predestroy Annotation applied destroy method!");
	}
	

}
