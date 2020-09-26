package com.gk.beans;

public class Employee {

	private int emp_no;
	private String emp_name;
	private float emp_salary;
	private String emp_address;

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("-----------------");
	}

	@Override
	public String toString() {
		return "Employee [emp_no=" + emp_no + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_address="
				+ emp_address + "]";
	}
}
