package com.xworkz.flights.booking;

import com.xworkz.flights.DTO.FlightBookingDTO;

public class FlightBooking {
	//this should multiple info of flight booking so make array declare dto class as a array type to hold multiple info of class
	private FlightBookingDTO[] booking=new FlightBookingDTO[5];
	int currentIndex=0;
	

	public FlightBooking() {
		super();
	}
     public void addBookingInfo(FlightBookingDTO dto) { 
    	 if(dto!=null) { 
         if(dto.getCode()!=null && dto.getCompany()!=null && dto.getBusinessClassPrice()>1000 && dto.getStartingPoint()!=null) {
        System.out.println("data is valid for booking info");	 
         
    	 this.booking[currentIndex]=dto; 
    	 this.currentIndex++;
         }else {
        	 System.out.println("invalid data provided for booking info");
         }
    	 }else {
    		 System.out.println("cant pass dto as null");
    	 }
     }
     
     public void displayInfoOfAll() {
    	 for(int i=0;i<this.booking.length;i++) {
    		 FlightBookingDTO dto=this.booking[i];
    		 if(dto!=null) {
    		 System.out.println(dto);
    		 System.out.println(dto.getAirplane());
    		 System.out.println(dto.getBusinessClassPrice());
    		 System.out.println(dto.getCode());
    		 System.out.println(dto.getDestination());
    		 System.out.println(dto.getEconomyClassPrice());
    		 System.out.println(dto.getStartingPoint());
    		 System.out.println(dto.getTotalSeats());
    		 System.out.println(dto.getCompany());
    		 System.out.println(dto.isDomestic());
    		 break;
    		 }else {
    			 System.out.println("flight info not there");
    			 break;
    		 }
    		 
    	 }
    	 
     }
     
     //starting point if provided as para to method it should give a bookingInfo and it should search by using for loop
     
     
     public void displayByStartingPoint(String StartingPoint) {
    
    //for(int i=0;i<this.booking.length;i++) {
    	//FlightBookingDTO  tempBook=this.booking[i];      
    	//this.bookin[] is nothing but reference of flightbookingDTO now this reference is having its own methods and means details of flightBookingDTO
    	//System.out.println(tempBook);
    	//System.out.println(tempBook.get);
    	
    //}
    	 this.displayInfoOfAll();
    	 
    	 
     }
	
	
}
