package com.gk.events;

import org.springframework.context.ApplicationListener;
//to handle the user defined Events.
public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent e) {
		e.generateLog();
	}

}
