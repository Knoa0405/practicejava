package com.noa.chapter2;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		int num = scan.nextInt();
		
		System.out.println(name);
		
		System.out.println(num);
	}

}
