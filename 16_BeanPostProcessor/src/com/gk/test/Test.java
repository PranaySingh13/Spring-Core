package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.Account;

public class Test {

	public static void main(String[] args) {

	AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
	Account acc=(Account) context.getBean("account");
	acc.getAccountDetails();
	context.registerShutdownHook();
	}

}
