package com.xworkz.checking;

public class PlayerDTO implements Cloneable{
	//player detailsd what are all a properties a player can have want to initialise using set and get method
	private String name;
	private int jerseyNo;
	private String sportName;
	
	// anythig u declare make it private this is how we achieve encapsulation
	public PlayerDTO() {
		System.out.println("defaul constructor");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	@Override
	public PlayerDTO clone() throws CloneNotSupportedException {
		PlayerDTO dto=(PlayerDTO)super.clone();
		
		return dto;
	}

}
