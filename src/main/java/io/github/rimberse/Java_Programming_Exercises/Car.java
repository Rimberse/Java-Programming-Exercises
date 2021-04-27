package io.github.rimberse.Java_Programming_Exercises;

public class Car extends Object {
	private String brand;
	private String model;
	
	public Car() {
		
	}
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String toString() {
		return brand + " " + model;
	}
}