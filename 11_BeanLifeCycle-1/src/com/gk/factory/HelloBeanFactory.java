package com.gk.factory;

import com.gk.beans.HelloBean2;

public class HelloBeanFactory {

	public HelloBean2 getBeanInstance() {
		System.out.println("Bean Instantiation Through Instance Factory Mehtod!");
		return new HelloBean2();
	}
	
}
