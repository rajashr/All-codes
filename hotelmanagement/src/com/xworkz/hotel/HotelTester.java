package com.xworkz.hotel;

import java.util.Arrays;

import com.xworkz.hotel.DTO.HotelDTO;
import com.xworkz.hotel.constants.Locations;
import com.xworkz.hotel.hotels.Hotels;


public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotels hotel=new Hotels();
		String[] fooditemss= {"rice","biryani","mango","apple","bonda soup","pizza","orange","sapota","sambar","pulav"};
		//System.out.println(Arrays.toString(fooditemss));
		HotelDTO dto=new HotelDTO("Sai", Locations.gandhinagar, "sangamesh", "veg", "sef-service", fooditemss);
		hotel.hotelInfo(null);
		hotel.displayInfo();
		hotel.displayByLocationAndName(Locations.gandhinagar, "Raj");
		hotel.displayOwner("S");
		
		
	}

}
