package com.xworkz.carshowroom;

import com.xworkz.carshowroom.DTO.Managerdto;

public class ShowRoom {
	//what all properties a carshowRoom can have
	private String name;
	private String location;
	//initially there was no manager in the showRoom lets connect managerdto class to this showRoom class
	private Managerdto manager;
	//now also it is pointing to null and we dont have manager lets add manager by using method addManager
	public ShowRoom() {
		System.out.println("default constructor");
	}
	public ShowRoom(String name, String location, Managerdto manager) {
		super();
		this.name = name;
		this.location = location;
		this.manager = manager;
	}
    //lets add manager
	public void addManager(String name,long contactNo) {
		//lets create a manager here by using new keyword and pass the reference
		if(name!=null && contactNo>0) {
		this.manager=new Managerdto(name,contactNo);
		System.out.println("can add manager valid data");
		}else {
			System.out.println("ivalid details cant add manager");
		}
	}
	public void displayManager() {
		if(this.manager)
		System.out.println(this.manager.getContactNo());
		System.out.println(this.manager.getName());
	}
}
