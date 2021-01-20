package com.noa.chapter1;

public class ClassTest {
	public static void main (String[] args) {
		SubClass lee = new SubClass();
		
		lee.name = "강노아";
		lee.age = 27;
		lee.jobOfManager = "소프트웨어 개발자";
		
		lee.print();
	}
}
