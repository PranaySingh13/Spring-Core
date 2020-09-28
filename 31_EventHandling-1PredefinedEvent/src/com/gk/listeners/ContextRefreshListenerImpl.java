package com.gk.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

//Listener Implementation Classes for Predefined Event ContextRefreshedEvent in Spring Framework
//This event rised when we start ApplicationContext or when we access "refresh()" method on ApplicationContext.
public class ContextRefreshListenerImpl implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent e) {
		System.out.println("Application Context Refreshed");
	}

}
