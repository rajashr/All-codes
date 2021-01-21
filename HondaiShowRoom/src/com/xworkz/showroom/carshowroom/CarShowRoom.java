package com.xworkz.showroom.carshowroom;

import com.xworkz.showroom.DTO.CarDTO;
import com.xworkz.showroom.DTO.ManagerDTO;

public class CarShowRoom {
	private String name;
	private String location;
	private ManagerDTO manager;
	private CarDTO[] cars=new CarDTO[5];

	public CarShowRoom(String name, String location, ManagerDTO manager) {
		super();
		this.name = name;
		this.location = location;
		this.manager = manager;
	}

	public CarShowRoom() {
		super();
	}

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.manager = new ManagerDTO(name, contactNo);
			System.out.println("valid data can add manager");
		} else {
			System.out.println("invalid data cannot add manager");
		}
	}

	public void displayManager() {
		if (this.manager != null) {
			System.out.println(this.manager.getContactNo());
			System.out.println(this.manager.getName());
		} else {
			System.out.println("manager is not there");
		}
	}
	public void addCars(CarDTO dto) {
	this.cars[0]=dto;	
		
	}
}
