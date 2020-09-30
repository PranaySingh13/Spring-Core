package com.gk.beans;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

	private int eno;
	private String ename;
	private float esal;
	private String eaddr;

	public Employee(int eno, String ename, float esal, String eaddr) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String search(int eno) {
		return "";
	}

	public void add(int eno, String ename, float esal, String eaddr) {

	}

	public void update(int eno, String ename, float esal, String eaddr) {

	}

	public void delete(int eno) {

	}
}
