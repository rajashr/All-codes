package com.xworkz.carshowroom;

import com.xworkz.carshowroom.constants.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showRoom.CarShowRoom;

public class ShowRoomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  CarShowRoom showroom=new CarShowRoom();
	  ManagerDTO dto=new ManagerDTO("ramesh",9481827790l);
	 showroom.addManager(dto);
	 showroom.displayManager();
	 CarDTO dto1=new CarDTO("swift", 200000, CarVariant.BASE);
	 showroom.addCars(dto1);
	 showroom.displayCars();
	 

	}

}
