package com.gk.beans;

import java.beans.PropertyEditorSupport;

//convert data from text to Object and from Object to text.
public class EmployeeAddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		System.out.println("Coming Address in Text Data: "+text);

		//Splits this string around matches of the given regular expression. 
		String[] str = text.split("-");
		
		EmployeeAddress eaddr = new EmployeeAddress();
		eaddr.setPno(str[0]);
		eaddr.setStreet(str[1]);
		eaddr.setCity(str[2]);
		eaddr.setState(str[3]);
		eaddr.setCountry(str[4]);
		
		//Set (or change) the object that is to be edited.
		super.setValue(eaddr);
	}
}
