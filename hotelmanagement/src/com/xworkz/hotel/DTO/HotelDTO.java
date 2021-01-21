package com.xworkz.hotel.DTO;

import com.xworkz.hotel.constants.Locations;

public class HotelDTO {
	private String name;
	private Locations location;
	private String ownerName;
	private String type;
	private String service;
	private String[] fooditems=new String[10];
	protected HotelDTO() {
		super();
	}
	public HotelDTO(String name, Locations location, String ownerName, String type, String service,
			String[] fooditems) {
		super();
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
		this.type = type;
		this.service = service;
		this.fooditems = fooditems;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Locations getLocation() {
		return location;
	}
	public void setLocation(Locations location) {
		this.location = location;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String[] getFooditems() {
		return fooditems;
	}
	public void setFooditems(String[] fooditems) {
		this.fooditems = fooditems;
	}
	
	

}
