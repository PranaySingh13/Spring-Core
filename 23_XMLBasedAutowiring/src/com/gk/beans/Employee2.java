package com.gk.beans;

public class Employee2 {

	private String eid;
	private String ename;
	private float esal;
	private Address eaddr;
	private Account eacc;

	public Employee2(String eid, String ename, float esal, Address eaddr, Account eacc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.eacc = eacc;
	}

	public void getEmployee2Details() {
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee Id: " + eid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + esal);
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("----------------");
		System.out.println("Account Number: " + eacc.getAccNo());
		System.out.println("Account Name: " + eacc.getAccName());
		System.out.println("Account Type: " + eacc.getAccType());
		System.out.println("Account Balance: " + eacc.getBalance());
		System.out.println();
		System.out.println("Employee Address Details");
		System.out.println("----------------");
		System.out.println("Plot No: " + eaddr.getPlotNo());
		System.out.println("Street: " + eaddr.getStreet());
		System.out.println("City: " + eaddr.getCity());
		System.out.println("State: " + eaddr.getState());
		System.out.println("Country: " + eaddr.getCountry());
	}
}
