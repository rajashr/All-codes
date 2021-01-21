package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;

public class BrowserTester {

	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.setName("google chrome");
		System.out.println(browser.getName());
		Object generic  = new Browser();
		Browser ref=(Browser)generic;
		ref.setName("IE");
		System.out.println(ref.getName());
		
		Object day=new String("tuesday");
				String reference=(String)day;
		
		day=new Browser();
		Browser refe=(Browser)day;
		
		

	}

}
