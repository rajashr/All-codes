package com.xworkz.events;

import com.xworkz.events.custom.DisplayCorrectName;
import com.xworkz.events.custom.UserNameValidation;

public class UserNameTester {

	public static void main(String[] args) {
		DisplayCorrectName ref=new DisplayCorrectName();
		
//showing me error bcoz it is looking for handler
		try {
		ref.name("raniA");
		}catch(UserNameValidation exe){
			System.err.println(exe.getMessage());
			
		}
		
	}

}
