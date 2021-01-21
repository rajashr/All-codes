package com.xworkz.carshowroom.showRoom;

import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;

public class CarShowRoom {
	private String name;
	private String location;
	private ManagerDTO manager;
	CarDTO[] cars=new CarDTO[5];
	int currentIndex=0;
	
	
	public CarShowRoom(String name, String location, ManagerDTO manager) {
		super();
		this.name = name;
		this.location = location;
		this.manager = manager;
	}
	public CarShowRoom() {
		super();
	}
	
	public void addManager(String name,long contactNo) {
		this.manager=new ManagerDTO(name,contactNo);
	}
	public void addManager(ManagerDTO dto) {
		if(dto!=null) {
			
		
		this.manager=dto;
		System.out.println("can add manager");
		}else {
			System.out.println("cant add manager");
		}
	}
	public void displayManager() {
		if(this.manager!=null) {
		System.out.println(this.manager.getName());
		System.out.println(this.manager.getContactNo());
		}
	}
	public void addCars(CarDTO dto) {
		if(this.currentIndex<5 && dto!=null) {
		this.cars[currentIndex]=dto;//if ci<5 then only add dto into array after adding increment otherwise it keeps on adding the dto in same index
		this.currentIndex++;
		
	}
	}
	public void displayCars() {
		
		
	CarDTO[]	tempcars=this.cars;
	for(int i=0;i<tempcars.length;i++) {

		CarDTO dto=this.cars[i];
		if(dto!=null ) {
		System.out.println(dto);
		System.out.println(dto.getModel());
		System.out.println(dto.getPrice());
		System.out.println(dto.getVariant());
		}
	}else {
			System.out.println("cannot add cars invalid data ");
		}
		
	
	}
	
	

}
