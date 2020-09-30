package com.gk.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.gk.beans.Employee;

public class Test {

	public static void main(String[] args) {
		/*
		 * It has ability to get and set property values, get property descriptors and
		 * checks the readability/writeability of properties.
		 */
		BeanWrapper bw = new BeanWrapperImpl(Employee.class);

		// to set the properties value
		bw.setPropertyValue("eno", 1);
		bw.setPropertyValue("ename", "Pranay Singh");
		bw.setPropertyValue("esal", 100000.0f);
		bw.setPropertyValue("eaddr", "Indore");

		// To get Bean object explicitly
		Employee emp1 = (Employee) bw.getWrappedInstance();
		System.out.println(emp1);// @e2144e4

		emp1.getEmployeeDetails();
		System.out.println();

		// If we want to set all the properties at a time to Bean object.
		Map<String, String> map = new HashMap<String, String>();
		map.put("eno", "2");
		map.put("ename", "Apoorva Singh");
		map.put("esal", "200000.0");
		map.put("eaddr", "Gwalior");
		bw.setPropertyValues(map);

		System.out.println(emp1);// @e2144e4(Object reference is same)

		emp1.getEmployeeDetails();

		System.out.println();

		// To get the property value
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee No: " + bw.getPropertyValue("eno"));
		System.out.println("Employee Name: " + bw.getPropertyValue("ename"));
		System.out.println("Employee Salary: " + bw.getPropertyValue("esal"));
		System.out.println("Employee Address: " + bw.getPropertyValue("eaddr"));

		
		//To Check whether the property is readable or writable.
		System.out.println(bw.isReadableProperty("eno"));
		System.out.println(bw.isReadableProperty("ename"));
		System.out.println(bw.isReadableProperty("esal"));
		System.out.println(bw.isReadableProperty("eaddr"));
		System.out.println("----");
		System.out.println(bw.isWritableProperty("eno"));
		System.out.println(bw.isWritableProperty("ename"));
		System.out.println(bw.isWritableProperty("esal"));
		System.out.println(bw.isWritableProperty("eaddr"));
		
		System.out.println("------------------");
		
		//To copy the properties values from one Bean object to another Bean object.
		Employee emp2=new Employee();
		
		/*
		 * emp1=source object
		 * emp2=target object
		 * source and target object objects of Same class or different classes 
		 * having same property names and same property data types.
		 */
		BeanUtils.copyProperties(emp1, emp2);
		System.out.println(emp2);//@5e265ba4(new Object Reference)
		emp2.getEmployeeDetails();
	}

}
