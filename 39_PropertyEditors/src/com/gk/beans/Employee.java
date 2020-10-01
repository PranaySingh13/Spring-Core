package com.gk.beans;

public class Employee {

	private int eno;
	private String ename;
	private float esal;

	// Custom Editor(If we want to provide address as whole address in single object).
	private EmployeeAddress eaddr;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public EmployeeAddress getEaddr() {
		return eaddr;
	}

	public void setEaddr(EmployeeAddress eaddr) {
		this.eaddr = eaddr;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee No: " + eno);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + esal);
		System.out.println();
		System.out.println("Employee Address Details");
		System.out.println("------------------------");
		System.out.println("Plot No: " + eaddr.getPno());
		System.out.println("Street: " + eaddr.getStreet());
		System.out.println("City: " + eaddr.getCity());
		System.out.println("State: " + eaddr.getState());
		System.out.println("Country: " + eaddr.getCountry());
	}
}
