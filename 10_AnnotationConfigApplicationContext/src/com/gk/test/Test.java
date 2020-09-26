package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gk.beans.HelloBean;
import com.gk.beans.WelcomeBean;
import com.gk.config.BeanConfig;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		HelloBean bean1 = (HelloBean) context.getBean("helloBean");
		System.out.println(bean1.sayHello());

		HelloBean bean2 = (HelloBean) context.getBean("helloBean");
		System.out.println(bean2.sayHello());

		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean1 == bean2);

		WelcomeBean bean3 = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println("Hello! " + bean3.getName());

		String beannames[] = context.getBeanDefinitionNames();
		for (String beanname : beannames) {
			System.out.println(beanname);

		}

	}

}
