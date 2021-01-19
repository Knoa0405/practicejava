package com.noa.chapter1;

public class Car {
	private String color;
	private String model;
	private int power;
	private int carSpeed;
	
	public Car() {
		carSpeed = 0;
	}
	
	public Car(String color, String model, int power) {
		this.color = color;
		this.model = model;
		this.power = power;
	}
	
	public void go() {
		if(power < 200) {
			carSpeed += 10;
		} else if(power >= 200) {
			carSpeed += 20;
		}
		System.out.printf("Accelerate %s, Current Speed %d\n", model, carSpeed);
	}
	
	public void stop() {
		carSpeed = 0;
	}
	
	public void setColor (String inputColor) {
		color = inputColor;
	}
	
	public void setModel (String inputModel) {
		model = inputModel;
	}
	
	public void setPower (int inputPower) {
		power = inputPower;
	}
	
}
