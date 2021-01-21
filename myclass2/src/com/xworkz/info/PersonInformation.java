package com.xworkz.info;

public class PersonInformation {
	public static String name; //fields are used to store the values
	public static String address;//fields are nothing but the variables which are declared at class level
	//class-var=static variable, non-static variables are nothing but instance variables
	public static String aadharNo;
	public static String dob;
	
	//methods are used to write the logic methods are nothing but functionalities
	public static void displayInfo() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(aadharNo);
		System.out.println(dob);
	}

}
