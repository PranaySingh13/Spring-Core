package com.gk.test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//IntroSpection is higher-level concept than Reflection api which can give information about properties information alongwith setXXX and getXXX methods in Java Beans Class Only.
		
		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
		PropertyDescriptor[] propDesc = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor p : propDesc) {
			System.out.println("Property Description: "+p);
			System.out.println("Property Name: "+p.getName());
			System.out.println("Property Type: "+p.getPropertyType());
			System.out.println("Property Read Method: "+p.getReadMethod());
			System.out.println("Property Write Method: "+p.getWriteMethod());
			System.out.println("----------------");
		}
		
		MethodDescriptor[] md=beanInfo.getMethodDescriptors();
		for(MethodDescriptor m:md) {
			System.out.println(m);
			System.out.println(m.getName());
			System.out.println("----------");
		}
	}

}
