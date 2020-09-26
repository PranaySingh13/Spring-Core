package com.gk.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.gk.beans.Account;

public class AccountPostProcessorImpl implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		System.out.println("Post Processing Before Initialization");
		Account acc = (Account) bean;
		if (acc.getAccType() == null) {
			acc.setAccType("Savings");
		}
		return acc;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		System.out.println("Post Processing After Initialization");

		Account acc = (Account) bean;

		String email = acc.getAccHolderEmail();
		if (!email.contains("@")) {
			email = email + "@gmail.com";
			acc.setAccHolderEmail(email);
		}

		String mobile = acc.getAccHolderMobileNo();
		if (!mobile.startsWith("91-")) {
			mobile = "91-" + mobile;
			acc.setAccHolderMobileNo(mobile);
		}

		return acc;
	}

}
