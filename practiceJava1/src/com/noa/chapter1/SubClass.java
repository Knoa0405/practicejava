package com.noa.chapter1;

public class SubClass extends SuperClass {
	String jobOfManager;
	
	public void print() {
		super.print();
		System.out.println("°ü¸®ÀÚ" + jobOfManager);
	}
}