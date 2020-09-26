package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.HelloBean;
import com.gk.beans.HelloBean1;
import com.gk.beans.HelloBean2;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");

		HelloBean bean1 = (HelloBean) context.getBean("hello");

		System.out.println(bean1.sayHello());

		HelloBean1 bean2 = (HelloBean1) context.getBean("hello1");

		System.out.println(bean2.sayHello());

		HelloBean2 bean3 = (HelloBean2) context.getBean("hello2");

		System.out.println(bean3.sayHello());
	}
}
