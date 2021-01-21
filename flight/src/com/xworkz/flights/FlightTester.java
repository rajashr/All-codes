package com.xworkz.flights;

import com.xworkz.flights.DTO.FlightBookingDTO;
import com.xworkz.flights.booking.FlightBooking;
import com.xworkz.flights.constants.CompanyName;

public class FlightTester {

	public static void main(String[] args) {
		FlightBooking flight=new FlightBooking();
		FlightBookingDTO dto=new FlightBookingDTO("air", "a12",CompanyName.AIRLAND, "Hubli", "Banglore",5, true, 5000.0, 6000.0);
		flight.addBookingInfo(dto);
		flight.displayByStartingPoint("Hubli");
		

	}

}
