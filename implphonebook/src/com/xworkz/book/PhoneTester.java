package com.xworkz.book;

import com.xworkz.book.phone.PhoneBook;

public class PhoneTester {

	public static void main(String[] args) {

		PhoneBook ref = new PhoneBook("MyBook", 55);
		System.out.println(ref.toString());

		PhoneBook ref2 = new PhoneBook("MyBook", 66);

		boolean var = ref.equals(ref2);
		System.out.println(var);
		System.out.println(ref.hashCode());
		System.out.println(ref2.hashCode());
		// i am making sure two instances are equal if there code is same so lets use it
		// as a equality factor
	
	// to objects are said to be equal if the equal method return true and hashCode
	// are same so lets override a hashCode'
		
		PhoneBook reference=new PhoneBook();
		reference.setCode(67888);
		System.out.println(reference.getCode());
		reference.setName("newone");
		System.out.println(reference.getName());
	//now i want a copy of this instance with same value so again i end up creating a lot of lines of code so to avoid that
		//i tell java to clone me this obj
		
		
		
		
	
	
	
}
