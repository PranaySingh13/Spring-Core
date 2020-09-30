package com.gk.test;

import java.beans.BeanInfo;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanInfoFactory;
import org.springframework.beans.ExtendedBeanInfoFactory;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) throws Exception {

		/*
		 * BeanInfoFactory: It is an alternative to "Beans Introspection" provided by
		 * Spring Framework. Spring Framework has provided a seperate predefined
		 * implementation class for BeanInfoFactory interface.
		 */
		BeanInfoFactory factory = new ExtendedBeanInfoFactory();
		BeanInfo beanInfo = factory.getBeanInfo(Employee.class);
		System.out.println(beanInfo);

		PropertyDescriptor[] propDesc = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor p : propDesc) {
			System.out.println("Property Description: " + p);
			System.out.println("Property Name: " + p.getName());
			System.out.println("Property Type: " + p.getPropertyType());
			System.out.println("Property Read Method: " + p.getReadMethod());
			System.out.println("Property Write Method: " + p.getWriteMethod());
			System.out.println("----------------");
		}

		MethodDescriptor[] md = beanInfo.getMethodDescriptors();
		for (MethodDescriptor m : md) {
			System.out.println(m);
			System.out.println(m.getName());
			System.out.println("----------");
		}
	}

}
