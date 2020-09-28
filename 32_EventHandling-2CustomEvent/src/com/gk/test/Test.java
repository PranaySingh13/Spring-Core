package com.gk.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Account;

public class Test {

	public static void main(String[] args) {
		// Child Interface of ApplicationContext to perform Event Handling in spring
		// applications.
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		Account acc = (Account) context.getBean("accBean");
		acc.createAccount();
		acc.searchAccount();
		acc.updateAccount();
		acc.deleteAccount();

	}

}
