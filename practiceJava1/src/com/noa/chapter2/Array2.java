package com.noa.chapter2;

import java.util.Arrays;
import java.util.List;

public class Array2 {
	public static void main (String [] args) {
		System.out.println("# 1. Declare and initialize an array");
		int[] scores = {95, 100, 87, 50};
		scores[2] = 90;
		
		System.out.println(Arrays.toString(scores));
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("\n# 2. asList()");
		String [] cars = {"Çö´ë", "»ï¼º", "º¥Ã÷"};
		
		List<String> car_list = Arrays.asList(cars);
		
		System.out.println(car_list);
		System.out.println(car_list.get(1));
		
		Arrays.sort(cars);
		System.out.println(Arrays.asList(cars));
		
		String[] numbers = {"1","2","5","-1"};
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}
}
