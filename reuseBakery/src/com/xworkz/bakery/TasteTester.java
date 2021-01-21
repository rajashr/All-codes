package com.xworkz.bakery;

import com.xworkz.bakery.bakery.Cake;
import com.xworkz.bakery.bakery.HoneyCake;

public class TasteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake = new Cake();
		cake.setFlavour("chocolate");
		cake.setFlavour("round");
		cake.setSize(1.0);
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		cake.taste();
		
		
		HoneyCake honey=new HoneyCake();
		//honey.setFlavour("venilla");
		//honey.setShape("triangle");
		//honey.setSize(1.5);
		honey.setFlavour("grams");
		honey.setHoney(true);
		honey.setShape("rounds");
		honey.setSize(1.7);
		System.out.println(honey.getFlavour());
		System.out.println(honey.getShape());
		System.out.println(honey.getSize());
		honey.taste();
		
		
		

	}

}
