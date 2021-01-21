package com.xworkz.events;

import com.xworkz.events.custom.CustomCheckedException;
import com.xworkz.events.custom.ExceptionThrower;

public class TesterforException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionThrower except=new ExceptionThrower();
		try {
		except.checked();
		}catch(CustomCheckedException custom){
        System.err.println(custom.getMessage());			
			
		}
		except.unchecked();
		

	}

}
