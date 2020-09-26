package com.gk.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		// As ApplicationContext does not close context object internally so we are
		// using its child class.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/durgasoft/cfgs/applicationContext.xml");

		// And for calling close method of context object explicitly use
		// try-with-resources statement
		try {
			HelloBean hb = (HelloBean) context.getBean("hello");
			System.out.println(hb.sayHello());
		} finally {
			context.close();
		}
	}

}
