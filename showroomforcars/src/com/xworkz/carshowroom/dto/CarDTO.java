package com.xworkz.carshowroom.dto;

import com.xworkz.carshowroom.constants.CarVariant;

public class CarDTO {
	private double price;
	private String model;
	private CarVariant variant;
	//lets initialise using a constructor or get set methods
	
	public CarDTO() {
		System.out.println("created using a default constructor");
	}
	public CarDTO (String model,double price, CarVariant variant) {
		super();//call to constructor of a parent class
		this.price = price;
		this.model = model;
		this.variant = variant;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public CarVariant getVariant() {
		return variant;
	}
	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}
	
	
	

}
