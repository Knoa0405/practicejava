package com.noa.chapter1;

public class OverloadingClass {
	void method () {
    	System.out.println("매개변수 없음");
    }
    
    void method (int a, int b) {
    	System.out.printf("매개변수 %d %d 있음\n", a , b);
    }
    
    void method (double d) {
    	System.out.println("매개변수 " + d);
    }
    
    public static void main(String[] args) {
    	OverloadingClass overload = new OverloadingClass();
    	
    	overload.method();
    	overload.method(1,2);
    	overload.method(3.3);
    }
}
