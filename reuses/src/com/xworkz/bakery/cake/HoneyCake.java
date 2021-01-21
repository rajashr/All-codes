package com.xworkz.bakery.cake;

public class HoneyCake extends Cake {
//here we are inheriting the properties from class cake to class HoneyCake and it is extending
	//KeyWord tells compiler that this class is extending other class
	private boolean honey; //tjis is specific for honeyCake

	public boolean isHoney() {
		return honey;
	}

	public void setHoney(boolean honey) {
		this.honey = honey;
	}
	
	
}
