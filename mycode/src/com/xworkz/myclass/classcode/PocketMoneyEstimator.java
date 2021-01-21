package com.xworkz.myclass.classcode;

public class PocketMoneyEstimator {
	
	private static double totalAmount;  //it is having all our latest values
	public static void request(String day,double amount) {
		System.out.println("invoked request");
		System.out.println(day);
		System.out.println(amount);
		totalAmount=totalAmount+amount;
		System.out.println(totalAmount);
		System.out.println("exit request");
	}
	public static void expnditure(double amount) {
		System.out.println("invoked expenditure");
		System.out.println("total amount i spent:"+  amount);
		totalAmount=totalAmount-amount;//we were having 8650 as total PocketMoney if we spend 5000 out of it what will be the amount 
		//remaining with us 8650-5000=?;
		System.out.println("after expenditure :" +totalAmount);
		
		System.out.println("exit expenditure");
		
	}
	
	public static double getTotalAmount() {
		return totalAmount;
	}

}
