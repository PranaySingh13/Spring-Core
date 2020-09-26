package com.gk.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
/*
 * new Implementation Class
 */
public class MethodReplacerImpl implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {

		/*
		 * Our New Implementation for which IOC container will check.
		 */
		System.out.println("Course Details");
		System.out.println("-----------------");
		System.out.println("Course Id : C-2");
		System.out.println("Course Name : Advance Java");
		System.out.println("Course Cost : 20000");
		return null;
	}

}
