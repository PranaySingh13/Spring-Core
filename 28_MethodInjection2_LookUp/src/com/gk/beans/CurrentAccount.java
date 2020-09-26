package com.gk.beans;

public class CurrentAccount implements Account {

	/*
	 * an implementation for the abstract method dynamically.
	 */
	@Override
	public void add() {
		System.out.println("Current Account is Added");
	}

	@Override
	public void get() {
		System.out.println("Current Account is Identified");
	}

	@Override
	public void update() {
		System.out.println("Current Account is Updated");
	}

	@Override
	public void delete() {
		System.out.println("Current Account is deleted");
	}

}
