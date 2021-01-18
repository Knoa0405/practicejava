package com.noa.chapter2;

import java.util.Arrays;

public class Array {
	int score[] = {95,100,87,81};
	
	public static void main (String[] args) {
		int scores[] = {95,100,87,91};
		
		int[] scores1 = new int[3];

		String[] cars = {"hyundai", "bmw", "benz", "apple"};
		
		Arrays.sort(cars);
		
		System.out.println(Arrays.toString(cars));
	}
}
