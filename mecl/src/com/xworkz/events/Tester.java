package com.xworkz.events;

import com.xworkz.checking.PlayerDTO;

public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		PlayerDTO dto=new PlayerDTO();
		
		//initialising all instance variables using get and set methods
		dto.setJerseyNo(55);
		System.out.println(dto.getJerseyNo());
		dto.setName("rani");
		System.out.println(dto.getName());
		dto.setSportName("Chess");
		System.out.println(dto.getSportName());
		
		//now if i want another object with the same value i have to write these lines of code again so then i can get copy of the object
		//so to avoid writing these lines of code again we can do cloning 
		//cloning is nothing but copy of object
		PlayerDTO ref=dto.clone();
		//PlayerDTO child=(PlayerDTO)ref;
		System.out.println(ref.getJerseyNo());
		System.out.println(ref.getName());
		System.out.println(ref.getSportName());
	    
	     //as i am using parent type to create object we should convert parent ref to child type to get access
	     
 	     
	     	
		
	}
	
	

}
