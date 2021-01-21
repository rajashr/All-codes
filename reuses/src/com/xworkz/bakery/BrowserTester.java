package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;

public class BrowserTester {

	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.setName("chrome");
		System.out.println(browser.getName());
		
		
		Object genericBrowser=new Browser();
		Browser refOfChild=(Browser)genericBrowser;
		refOfChild.setName("IE");
		System.out.println(refOfChild.getName());
		
		Object day=new String();
		
		String ref=(String)day;
		//now i can get access to all the methods 
		Browser reference=(Browser)day;
		
		
		
	}

}
