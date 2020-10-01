package com.gk.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.gk.beans.DatabaseBean;

public class Test {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "production"); //It will Active the Production Phase.
		
	//	System.setProperty("spring.profiles.active", "development"); //It will Active the Development Phase.
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("/com/gk/resources/applicationContext-development.xml",
				"/com/gk/resources/applicationContext-production.xml");
		context.refresh();
		DatabaseBean bean = (DatabaseBean) context.getBean("dbBean");
		bean.displayDatabaseDetails();
		bean.listTables();
	}

}
