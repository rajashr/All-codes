package com.xworkz.myclass.DTO;

public class KeyDTO {
	private int[] keys= {1,2,3,4,5,6,7,8,9};
	private String on;
	private String off;
	
	//initialise using constructor
	//means whenever someone is creating the object of this dto we are forcing to initialise the fields or pass the args
	public KeyDTO(String on,String off) {
		
		this.on=on;
		this.off=off;
	}

	public int[] getKeys() {
		return keys;
	}

	public String getOn() {
		return on;
	}

	public String getOff() {
		return off;
	}
	

}
