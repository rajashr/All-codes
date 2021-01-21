package com.xworkz.laptop.company;

public class Admin {
	public static void develop() {
		System.out.println("invoked develop method");
		String model=Lenevo.getModel();
		System.out.println("will develop using model :"+model);
		Lenevo.developApplication();
		System.out.println("exit develop");
	}

}
