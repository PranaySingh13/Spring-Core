package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.beans.I18NBean;

public class Test {

	public static void main(String[] args) {
		/*
		 * If we want to take messages from .properties file, use
		 * ResourceBundleMessageSource class in applicationContext.xml.
		 */
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/gk/resources/applicationContext.xml");
		I18NBean bean1 = (I18NBean) context1.getBean("i18nBean1");
		bean1.displayMessage();

		/*
		 * If we want to take messages from XML file, use
		 * ReloadableResourceBundleMessageSource class in applicationContext.xml.
		 */
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/gk/resources_xml/applicationContext.xml");
		I18NBean bean2 = (I18NBean) context2.getBean("i18nBean2");
		bean2.displayMessage();
		
		/*
		 * To Run and Get the output in various Locales Just Right Click on Your
		 * Test.java->properties->select UTF-8 instead of Cp1252 or other encoder.
		 */

	}

}
