package com.xworkz.carshowroom.DTO;

public class Managerdto {
	//what properties a manager could have
	private String name;
	private long contactNo;
	
	public Managerdto() {
		System.out.println("creadted manager using default constructor");
		this.name=name;
		this.contactNo=contactNo;
	}
	public Managerdto(String name,long contactNo) {
		this.name=name;
		this.contactNo=contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

}
