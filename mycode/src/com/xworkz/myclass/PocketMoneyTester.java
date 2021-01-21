package com.xworkz.myclass;

import com.xworkz.myclass.classcode.PocketMoneyEstimator;

public class PocketMoneyTester {

	public static void main(String[] args) {
		//you can static members using class name
		System.out.println("invoked main");
		
		PocketMoneyEstimator.request("Monday", 50.0);
		PocketMoneyEstimator.request("Wed", 600);
		PocketMoneyEstimator.request(null, 8000);
		
		PocketMoneyEstimator.expnditure(5000);
		System.out.println(PocketMoneyEstimator.getTotalAmount());
		
		
		System.out.println("exit main");

	}

}
