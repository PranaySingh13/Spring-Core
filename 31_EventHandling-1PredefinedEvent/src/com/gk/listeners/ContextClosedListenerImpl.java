package com.gk.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

//Listener Implementation Classes for Predefined Event ContextClosedEvent in Spring Framework
public class ContextClosedListenerImpl implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent e) {
		System.out.println("Application Context Closed");
	}

}
