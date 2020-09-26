package com.gk.beans;

public class SavingsAccount implements Account {

	/*
	 * an implementation for the abstract method dynamically.
	 */
	@Override
	public void add() {
		System.out.println("Savings Account is Added");
	}

	@Override
	public void get() {
		System.out.println("Savings Account is Identified");
	}

	@Override
	public void update() {
		System.out.println("Savings Account is Updated");
	}

	@Override
	public void delete() {
		System.out.println("Savings Account is deleted");
	}

}
