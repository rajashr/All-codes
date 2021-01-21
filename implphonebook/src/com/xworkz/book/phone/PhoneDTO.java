package com.xworkz.book.phone;

public class PhoneDTO implements Cloneable{
	private String name;
	private int code;
	public PhoneDTO() {
		super();
	}
	public PhoneDTO(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
	public PhoneDTO clone() throws CloneNotSupportedException {
		PhoneDTO dto=(PhoneDTO)super.clone();
		return dto;
	}

}
