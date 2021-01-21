package com.xworkz.contract.vrl;

import java.io.Serializable;

import com.xworkz.contract.agency.Contract;
import com.xworkz.contract.contractagree.Security;

public class RedbusImplementor implements Contract,Security {
	@Override
	public void open() {
		System.out.println("invoked open");
	}
	@Override
	public void close() {
		System.out.println("invoked close");
	}
	public int maxBooking() {
		System.out.println("invoked maxBooking");
		return 0;
	}
	

}
