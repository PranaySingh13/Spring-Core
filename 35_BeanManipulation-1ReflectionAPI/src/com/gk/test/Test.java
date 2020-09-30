package com.gk.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *ReflectionAPI can give information any Java Class.		
 */
public class Test {

	public static void main(String[] args) throws Exception {

		Class c = Class.forName("com.gk.beans.Employee");
		System.out.println("Class Name: " + c.getName());
		
		System.out.println("Super Class Name: " + c.getSuperclass());
		
		System.out.print("Interfaces :");
		Class[] cls = c.getInterfaces();
		for (Class c1 : cls) {
			System.out.print(c1.getName() + " ");
		}
		System.out.println();
		
		System.out.print("Variables :");
		Field[] flds = c.getDeclaredFields();
		for (Field f : flds) {
			System.out.print(f.getName() + " ");
		}
		System.out.println();
		
		System.out.print("Constructors :");
		Constructor[] cons = c.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.print(con.getName() + " ");
		}
		System.out.println();
		
		System.out.print("Methods :");
		Method[] mthds = c.getDeclaredMethods();
		for (Method m : mthds) {
			System.out.print(m.getName() + " ");
		}
		System.out.println();
	}

}
