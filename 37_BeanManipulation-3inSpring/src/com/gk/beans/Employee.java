package com.gk.beans;

public class Employee {

	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	public int getEno() {
		return eno;
	}
	/*
	 *In BeanInfoFactory implementation, it accepts JavaBeans
	 *setter methods as 'writable' which returns some
	 *values instead of void.
	 */
	public int setEno(int eno) {
		this.eno = eno;
		return eno;
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
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	
}
