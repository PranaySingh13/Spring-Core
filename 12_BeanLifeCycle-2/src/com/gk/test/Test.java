package com.gk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.HelloBean1;
import com.gk.beans.HelloBean2;
import com.gk.beans.HelloBean3;
import com.gk.beans.HelloBean4;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/gk/resources/applicationContext.xml");
		
		HelloBean1 bean1 = (HelloBean1) context.getBean("hellobean1");
		System.out.println(bean1.sayHello());
		
		System.out.println("--------------------");

		HelloBean2 bean2 = (HelloBean2) context.getBean("hellobean2");
		System.out.println(bean2.sayHello());
		
		System.out.println("--------------------");
		
		HelloBean3 bean3 = (HelloBean3) context.getBean("hellobean3");
		System.out.println(bean3.sayHello());

		System.out.println("---------------------");
		
		HelloBean4 bean4 = (HelloBean4) context.getBean("hellobean4");
		System.out.println(bean4.sayHello());
		
		/*
		 * context.close(); and context.destroy(); They will work same as for closing
		 * the container so, we can't get bean back.
		 */

		/*
		 * It will do special clean up operations after main thread ends in case when
		 * JVM is shutting down until it will run all the bean objects.
		 */
		context.registerShutdownHook();

	}

}
