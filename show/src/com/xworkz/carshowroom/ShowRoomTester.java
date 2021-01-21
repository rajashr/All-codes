package com.xworkz.carshowroom;

public class ShowRoomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom showroom=new ShowRoom();
		showroom.addManager("rani", 9481827790l);
		showroom.displayManager();
		showroom.addManager(null,94818256);
		showroom.displayManager();
		showroom.addManager(null, 728898);
		showroom.displayManager();
		

	}

}
