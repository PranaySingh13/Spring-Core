package com.gk.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

//Listener Implementation Classes for Predefined Event ContextStoppedEvent in Spring Framework
public class ContextStoppedListenerImpl implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent e) {
		System.out.println("Application Context Stopped");
	}

}
