package com.xworkz.events.uncustom;

import com.xworkz.events.custom.EmailValid;

public class Display {
    public void printemail(String email) throws EmailValid {
    	//whoever call this method they have to give email they call also pass null so lets do validation
    	if(email!=null) {
    		if(email.contains("@") &&
    				(email.contains(".com") || email.contains(".in"))) {
    			System.out.println("valid email");
    			System.out.println(email);
    		}else {
    			//if not a proper then we need to throw exception
    			//throw new EmailValid("email should contain all possibilties");
    			EmailValid eventCreated=new EmailValid("email should contain @, .in or .com");
    			throw eventCreated;
    		}
    	}
    	
}
}