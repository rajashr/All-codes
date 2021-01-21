package com.xworkz.events.custom;

public class DisplayCorrectName  {
	public void name(String num) throws UserNameValidation {
		if(num!=null) {
			if(num.contains("A")) {
				System.out.println("valid user name");
				System.out.println(num);
			}else {
				//otherwise i will write my own exception and create an exceptional event to notify someone who calls the method and
				//pass the name it must contain " A " 
				throw new UserNameValidation("name should contain A");
				//it is showing me a error so now i need to handle event created or delegate so caller of method need to handle
				//i need to give some messages for the exception y it is created to make easy for someone to handle it or correct it easily
				
			}
		}
	}

}
