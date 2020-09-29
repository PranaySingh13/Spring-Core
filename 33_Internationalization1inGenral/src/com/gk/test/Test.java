package com.gk.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {

		Locale l = new Locale("en", "US");
		NumberFormat nf = NumberFormat.getInstance(l);
		System.out.println(nf.format(123456789.12345));// 123,456,789.123

		// Here 0->3 represents the date format style index
		DateFormat df1 = DateFormat.getDateInstance(0, l);
		DateFormat df2 = DateFormat.getDateInstance(1, l);
		DateFormat df3 = DateFormat.getDateInstance(2, l);
		DateFormat df4 = DateFormat.getDateInstance(3, l);
		System.out.println(df1.format(new Date()));// Tuesday, September 29, 2020
		System.out.println(df2.format(new Date()));// September 29, 2020
		System.out.println(df3.format(new Date()));// Sep 29, 2020
		System.out.println(df4.format(new Date()));// 9/29/20
		
		/*
		 * To Run and Get the output in various Locales Just Right Click on Your
		 * Test.java->properties->select UTF-8 instead of Cp1252 or other encoder.
		 */
		ResourceBundle rb1 = ResourceBundle.getBundle("com/gk/resources/message_en_US", l);
		System.out.println(rb1.getString("Welcome"));//Welcome To I18N Concept
		
		Locale l1 = new Locale("hi", "IN");
		NumberFormat nf2 = NumberFormat.getInstance(l1);
		System.out.println(nf2.format(123456.123456));
		
		DateFormat df5 = DateFormat.getDateInstance(0, l1);
		System.out.println(df5.format(new Date()));//मंगलवार, २९ सितंबर, २०२०

		ResourceBundle rb2 = ResourceBundle.getBundle("com/gk/resources/message_hi_IN", l1);
		System.out.println(rb2.getString("Welcome"));//स्वागत हे

	}

}
