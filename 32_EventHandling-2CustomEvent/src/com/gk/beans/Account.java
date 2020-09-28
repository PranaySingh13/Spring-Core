package com.gk.beans;

import com.gk.events.AccountEventPublisher;

public class Account {

	private AccountEventPublisher publisher;

	public void setPublisher(AccountEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void createAccount() {
		System.out.println("Account Created.....");
		publisher.publish("Account Created by Publisher");
	}

	public void searchAccount() {
		System.out.println("Account Identified.....");
		publisher.publish("Account Identified by Publisher");
	}

	public void updateAccount() {
		System.out.println("Account Updated.....");
		publisher.publish("Account Updated by Publisher");
	}

	public void deleteAccount() {
		System.out.println("Account Deleted.....");
		publisher.publish("Account Deleted by Publisher");
	}
}
