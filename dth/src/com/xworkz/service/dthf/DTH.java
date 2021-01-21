package com.xworkz.service.dthf;

public class DTH {
	protected String subscriberId;
	protected String subscription;
	protected double price;
	protected int noOfports;
	
	
	//functionality
	private void connection() {
		System.out.println("invoked connection");
	}


	protected DTH() {
		super();
	}


	public String getSubscriberId() {
		return subscriberId;
	}


	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}


	public String getSubscription() {
		return subscription;
	}


	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getNoOfports() {
		return noOfports;
	}


	public void setNoOfports(int noOfports) {
		this.noOfports = noOfports;
	}


}