package com.xworkz.contract.agency;

import com.xworkz.contract.contractagree.RedbusContract;

public class TravelAgency {
	
	private String agencyName=new String("Rajashree travels");
	private RedbusContract contract;

	public TravelAgency(RedbusContract contract) {
		System.out.println("defualt constructor");
		this.contract = contract;
	}

	public void acceptBooking() {
		System.out.println("invoked acceptBooking");
		System.out.println("checking bookings for "+this.agencyName);
		boolean warranty = this.contract.busWarranty();
		if (warranty) {
			System.out.println("bus is under warranty");
			int seats = contract.minNoOfSeats();
			if (seats > 0 && seats < 20) {
				System.out.println("can accept booking");
			} else {
				System.out.println("cannot accept booking");
			}
		}else {
			System.out.println("bus is not under warranty");
		}

	}

}
