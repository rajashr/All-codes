package com.xworkz.service.cable;

import com.xworkz.service.dth.DTH;

public class SunDirectDTH extends DTH {
	protected String subscriptionId="IDG";//it can still hide a property override a method (can get access to a constructor only within a subclass
	@Override
	protected void connection()
	{
		System.out.println("invoked connection by subclass");
	}
	public void NameOfsubscriberId() {
		super.setSubscription("ghi");
	}
  public SunDirectDTH() {
	  super("ID", 5);//call to a constructor
  }
	

}
