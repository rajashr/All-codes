package com.xworkz.hotel.hotels;

import java.util.Arrays;

import com.xworkz.hotel.DTO.HotelDTO;
import com.xworkz.hotel.constants.Locations;

public class Hotels {
	private HotelDTO[] hotel = new HotelDTO[5];
	private Locations location;
	int currentIndex = 0;

	public void hotelInfo(HotelDTO dto) {
		if (this.currentIndex < 5 && dto != null) {

			if (dto.getName() != null && dto.getLocation() != null && dto.getFooditems() != null) {
				System.out.println("can give hotel info because valid data");

				this.hotel[currentIndex] = dto;// adding this hotelInfo into array and after adding increment
				this.currentIndex++;

			} else {
				System.out.println("invalid hotel info");
			}
		} else {
			System.out.println("index is greater than 5, provide valid index");
		}

	}

	public void displayInfo() {
		HotelDTO[] multiple = this.hotel;
		for (int i = 0; i < multiple.length; i++) {

			HotelDTO dto = multiple[i];
			if (dto != null) {
				System.out.println(dto.getName());
				System.out.println(dto.getOwnerName());
				System.out.println(dto.getService());
				System.out.println(dto.getType());
				System.out.println(dto.getLocation());
				System.out.println(Arrays.toString(dto.getFooditems()));
				break;
			} else {
				System.out.println("hotel is not there");
				break;
			}

		}
	}
	
	
	
	public void displayByLocationAndName(Locations location,String name) {
		if(location!=null && name!=null) {
			for(int i=0;i<this.hotel.length;i++) {
				HotelDTO dto=this.hotel[i];
				if(dto!=null) {
				if(location.equals(dto.getLocation()) &&  name.equals(dto.getName())) {
					System.out.println(dto.getName());
					System.out.println(dto.getLocation());
				}else {
					System.out.println("name and location not matches");
				}
				}
			}
		}
		
	}
	
	//display owner name by hotel name
	//means if we pass hotel name it should give me owner name 
	public void displayOwner(String hotelName) {
		if(hotelName!=null) {
			for(int i=0;i<this.hotel.length;i++) {
				HotelDTO dto =this.hotel[i];
				if(dto!=null && hotelName.equals(dto.getName())) {
				System.out.println(dto.getOwnerName());
				break;
				}else {
					System.out.println("owner is null");
					break;
				}
			}
		}else {
			System.out.println("hotel is   not there");
		}
		
	}

}
