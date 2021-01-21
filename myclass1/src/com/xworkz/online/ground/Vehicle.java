package com.xworkz.online.ground;

public class Vehicle {//these are instance variables and we can access by creating obj of this class and by using a ref variable
	public String model;
	public String color;
	public static String owner;
	
	public void displayInfo() {
		System.out.println("invoked method");
		System.out.println(model);
		System.out.println(color);
		System.out.println(owner);
	}

}
