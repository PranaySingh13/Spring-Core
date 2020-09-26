package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.CurrentAccount;
import com.gk.beans.SavingsAccount;
import com.gk.factory.AccountFactory;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		
		AccountFactory savAccFactory=(AccountFactory)context.getBean("savingsAccountFactory");
		SavingsAccount savAccount=(SavingsAccount) savAccFactory.getAccount();
		savAccount.add();
		savAccount.get();
		savAccount.update();
		savAccount.delete();
		
		System.out.println();
		
		AccountFactory curAccFactory=(AccountFactory)context.getBean("currentAccountFactory");
		CurrentAccount curAccount=(CurrentAccount) curAccFactory.getAccount();
		curAccount.add();
		curAccount.get();
		curAccount.update();
		curAccount.delete();
		
		
	}

}
