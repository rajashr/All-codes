package com.xworkz.book;

import com.xworkz.book.phone.PhoneDTO;

public class DTOtester {

	public static void main(String[] args) {
		PhoneDTO dto=new PhoneDTO();
		dto.setCode(56789);
		System.out.println(dto.getCode());
		dto.setName("MySlam");
		System.out.println(dto.getName());
		
		//clone means copy of a object
		//it return a Object
		PhoneDTO obj=dto.clone();
		

	}

}
