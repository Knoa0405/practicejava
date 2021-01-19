package com.noa.chapter1;


public class CarGame {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setColor("RED");
		c1.setModel("Hyundai");
		c1.setPower(180);
		
		Car c2 = new Car("BLUE", "BMW", 210);
		c1.go();
		c2.go();
	}
}
