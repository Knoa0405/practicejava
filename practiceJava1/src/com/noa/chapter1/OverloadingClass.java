package com.noa.chapter1;

public class OverloadingClass {
	void method () {
    	System.out.println("�Ű����� ����");
    }
    
    void method (int a, int b) {
    	System.out.printf("�Ű����� %d %d ����\n", a , b);
    }
    
    void method (double d) {
    	System.out.println("�Ű����� " + d);
    }
    
    public static void main(String[] args) {
    	OverloadingClass overload = new OverloadingClass();
    	
    	overload.method();
    	overload.method(1,2);
    	overload.method(3.3);
    }
}
