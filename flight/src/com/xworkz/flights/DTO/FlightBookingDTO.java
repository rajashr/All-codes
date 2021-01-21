package com.xworkz.flights.DTO;

import com.xworkz.flights.constants.CompanyName;

public class FlightBookingDTO {
	//information of one flight booking but a program should hold multiple info so make it array so now it is holding multiple flight booking info
	private String airplane;
	private String code;
	private CompanyName company;
	private String startingPoint;
	private String destination;
	private int totalSeats;
	private boolean domestic;
	private double businessClassPrice;
	private double economyClassPrice;
	public FlightBookingDTO() {
		super();
	}
	public FlightBookingDTO(String airplane, String code, CompanyName company, String startingPoint, String destination,
			int totalSeats, boolean domestic, double businessClassPrice, double economyClassPrice) {
		super();
		this.airplane = airplane;
		this.code = code;
		this.company = company;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.totalSeats = totalSeats;
		this.domestic = domestic;
		this.businessClassPrice = businessClassPrice;
		this.economyClassPrice = economyClassPrice;
	}
	public String getAirplane() {
		return airplane;
	}
	public String getCode() {
		return code;
	}
	public CompanyName getCompany() {
		return company;
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public String getDestination() {
		return destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public boolean isDomestic() {
		return domestic;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public double getEconomyClassPrice() {
		return economyClassPrice;
	}
}