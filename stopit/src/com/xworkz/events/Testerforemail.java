package com.xworkz.events;

import com.xworkz.events.custom.EmailValid;
import com.xworkz.events.uncustom.Display;

public class Testerforemail {

	public static void main(String[] args) {
		Display ref=new Display();
		try {
		ref.printemail("rani@rajacom");
		}catch(EmailValid exe) {
			System.err.println(exe.getMessage()); //reference is used to get info of the exception
		//the reference is used to get to exactly what is the exception is and what is our mistake how we can resolve or fix it
		}

	}

}
