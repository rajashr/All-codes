package com.xworkz.contract.agency;

import com.xworkz.contract.contractagree.RedbusContract;
import com.xworkz.contract.vrl.RedbusContractImplementer;

public class Tester {

	public static void main(String[] args) {
		RedbusContract contract = new RedbusContractImplementer();
		TravelAgency agency = new TravelAgency(contract);
		agency.acceptBooking();
	}

}
