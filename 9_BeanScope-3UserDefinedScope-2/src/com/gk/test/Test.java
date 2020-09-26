package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.HelloBean;
import com.gk.scopes.ThreadScope;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");

		HelloBean bean1=(HelloBean) context.getBean("hellobean");
		HelloBean bean2=(HelloBean) context.getBean("hellobean");
		
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1==bean2);
		System.out.println(bean1.sayHello());
		System.out.println(bean2.sayHello());
		
		ThreadScope threadScope=(ThreadScope) context.getBean("threadScope");
		HelloBean bean3=(HelloBean) threadScope.remove("hellobean");
		System.out.println(bean3);
		System.out.println("After Remove the Object reference");
		
		HelloBean bean4=(HelloBean) context.getBean("hellobean");
		HelloBean bean5=(HelloBean) context.getBean("hellobean");
		System.out.println(bean4);
		System.out.println(bean5);
		System.out.println(bean4==bean5);
		System.out.println(bean4.sayHello());
		System.out.println(bean5.sayHello());
		
	}

}
