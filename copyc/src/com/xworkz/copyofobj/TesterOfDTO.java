package com.xworkz.copyofobj;

import com.xworkz.copyofobj.constants.PhoneBookDTO;

public class TesterOfDTO {

	public static void main(String[] args) {
		PhoneBookDTO dto=new PhoneBookDTO();
		dto.setName("veeru");
		dto.setPhoneNo(839998299l);
		dto.setPincode(44889);
		
		PhoneBookDTO dto1=new PhoneBookDTO();
		dto.setName("veeru");
		dto.setPhoneNo(839998299l);
		dto.setPincode(44889);
		
		String reference=new String("word");
		
		boolean ref=dto1.equals(dto); // i am passing one reference dto and i want to check awhetherr it is equal to dto1 which is current instance reference
		boolean ref5=dto1.equals(reference);
		

	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

}
