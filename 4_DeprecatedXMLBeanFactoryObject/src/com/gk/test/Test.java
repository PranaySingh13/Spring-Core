package com.gk.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {
		/*
		 * XmlBeanFactory is depricated after spring 3 version
		 */
		XmlBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("/com/gk/resources/applicationContext.xml"));
		Employee e = (Employee) factory.getBean("empbean");
		System.out.println(e.sayHello());
	}

}
