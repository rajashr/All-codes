package com.xworkz.contract.vrl;

import com.xworkz.contract.contractagree.RedbusContract;

public class RedbusContractImplementer implements RedbusContract {

	@Override
	public int minNoOfSeats() {
		System.out.println("invoked minimum seats");
		return 10;
	}

	@Override
	public boolean busWarranty() {
		System.out.println("invoked busWarranty");
		return true;
	}
	
	

}
