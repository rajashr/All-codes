package com.xworkz.anniversary;

import com.xworkz.info.PersonInformation;

public class PersonTester {

	public static void main(String[] args) {
		//we can access static variables by using class name
		PersonInformation.aadharNo="45648499";
		PersonInformation.address="Manahath Nagar";
		PersonInformation.dob="28/02/98";
		PersonInformation.name="Rani";
		
		PersonInformation.displayInfo();
		
		PersonInformation.aadharNo="363789";
		PersonInformation.address="jayaNagar";
		//PersonInformation.dob="356/090"; providing miss information about the date of birth
		PersonInformation.name="jdkk";
		PersonInformation.displayInfo();

	}

}
