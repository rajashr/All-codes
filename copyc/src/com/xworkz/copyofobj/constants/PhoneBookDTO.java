package com.xworkz.copyofobj.constants;

public class PhoneBookDTO {
	private String name;
	private long phoneNo;
	private int pincode;
	
	//as we used default constructor to initialise the instance variable we can use get set methods
	public PhoneBookDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PhoneBookDTO [name=" + name + ", phoneNo=" + phoneNo + ", pincode=" + pincode + "]";
	}
	
	//lets override hashcode

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

		
	public boolean equals(Object obj) {
		if(obj!=null) {
		 if(obj==this) {
			 return true;
		 }else {
			 if(obj instanceof PhoneBookDTO) {
				 PhoneBookDTO casted=(PhoneBookDTO)obj;
				 if(casted.getName()!=null && this.name.equals(casted.getName())){
					 System.out.println("name is same");
					 
				 }else {
					 System.out.println("name is not name");
				 }
			 }
		 }
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
