package com.gk.core;

/*
 * providing String data in ThreadLocal for User defined scope class ThreadScope
 */
class ThreadScope extends ThreadLocal<String> {
	@Override
	protected String initialValue(){
		return "No Data in this Scope";
	}
}

class A {
	void m1() {
		System.out.println("Thread1 Scope for m1() is :"+Thread1.threadScope.get());
		System.out.println("Thread2 Scope for m1() is :"+Thread2.threadScope.get());
	}

	void m2() {
		System.out.println("Thread2 Scope for m2() is :"+Thread2.threadScope.get());
		System.out.println("Thread1 Scope for m2() is :"+Thread1.threadScope.get());
	}

}
class Thread1 extends Thread{
	static ThreadScope threadScope=new ThreadScope();
	A a;
	Thread1(A a) {
		this.a = a;
	}
	public void run() {
		threadScope.set("A Data");
		a.m1();
	}
	
}
class Thread2 extends Thread{
	static ThreadScope threadScope=new ThreadScope();
	A a;
	Thread2(A a) {
		this.a = a;
	}
	public void run() {
		threadScope.set("B Data");
		a.m2();
	}
	
}
public class Test {

	public static void main(String[] args) {

		A a=new A();
		Thread1 t1=new Thread1(a);
		Thread2 t2=new Thread2(a);
		t1.start();
		t2.start();
	}

}
