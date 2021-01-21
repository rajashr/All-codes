package com.xworkz.checking;

public class PhoneDTO {
	private String name;
	private int code;
	
	//what are all the properties a phonebook cn have
    //we can initialise these proprties using constructor or set method
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}

}
