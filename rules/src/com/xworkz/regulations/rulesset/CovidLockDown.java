package com.xworkz.regulations.rulesset;

public class CovidLockDown implements CoronaLockDown{

	@Override
	public int socialDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void wearMask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String sanitiser() {
		// TODO Auto-generated method stub
		return null;
	}
	public void display()
	{
		System.out.println("invoked display");
	}
	
	

}
