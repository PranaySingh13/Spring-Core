package com.gk.beans;

public class Employee1 {

	private String eid;
	private String ename;
	private float esal;
	private Address eaddr;
	private Account eacc;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getEaddr() {
		return eaddr;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public void setEaddr(Address eaddr) {
		this.eaddr = eaddr;
	}

	public Account getEacc() {
		return eacc;
	}

	public void setEacc(Account eacc) {
		this.eacc = eacc;
	}

		public void getEmployee1Details() {
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esal);
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("----------------");
		System.out.println("Account Number: "+eacc.getAccNo());
		System.out.println("Account Name: "+eacc.getAccName());
		System.out.println("Account Type: "+eacc.getAccType());
		System.out.println("Account Balance: "+eacc.getBalance());
		System.out.println();
		System.out.println("Employee Address Details");
		System.out.println("----------------");
		System.out.println("Plot No: "+eaddr.getPlotNo());
		System.out.println("Street: "+eaddr.getStreet());
		System.out.println("City: "+eaddr.getCity());
		System.out.println("State: "+eaddr.getState());
		System.out.println("Country: "+eaddr.getCountry());
	}
}
