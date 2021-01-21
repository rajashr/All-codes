package com.xworkz.service.dth;

public class DTH {
	
	protected String subscriberId;
	protected String subscription;
	protected int noOfPorts;
	protected double price;
	
	protected DTH() {
		System.out.println("invoked default constructor");
	}
	protected DTH(String subscriptionId,int noOfPorts) {
		System.out.println("parameterised constructor");
	}
	
	protected void connection()
	{
		System.out.println("invoked connection");
	}
	
	public String subscription() {
		return subscriberId;
	}
	protected void getSubscription(String subscription) {
		this.subscription = subscription;
	}
}