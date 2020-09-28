package com.gk.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

//Listener Implementation Classes for Predefined Event ContextStartedEvent in Spring Framework
public class ContextStartedListenerImpl implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent e) {
		System.out.println("Application Context Started");
	}

}
