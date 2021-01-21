package com.xworkz.laptop;

import com.xworkz.laptop.company.Lenevo;

public class Tester {

	public static void main(String[] args) {
		Lenevo.developApplication();
		System.out.println(Lenevo.getModel());
		//Lenevo.model="DEAD";
		System.out.println(Lenevo.getModel());
  //now anyone can come and change the model soto avoid this make the class variable as private
	}

}
