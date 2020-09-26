package com.gk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/com/gk/resources/applicationContext.xml");
		/*
		 * XmlBeanFactory is depricated after spring 3 version
		 * */
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e = (Employee) factory.getBean("empbean");
		e.getEmpDetails();
		System.out.println(e.toString());
	}

}
