package com.xworkz.bakery;

import com.xworkz.bakery.cake.Cake;
import com.xworkz.bakery.cake.HoneyCake;

public class TatsteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake=new Cake();
		//cake.flavour="choco";
		//cake.shape="round";
		//cake.size=5.9;
		System.out.println(cake.getFlavour());
		System.out.println(cake.getShape());
		System.out.println(cake.getSize());
		
		cake.taste();
//it is an ordinary cake and someother cake some special properties along with these properties at that time instead of writing all these logic once again we can inherit
	
		HoneyCake honeyCake=new HoneyCake();
		System.out.println(honeyCake.getFlavour());
		System.out.println(honeyCake.getShape());
		System.out.println(honeyCake.getSize());
		honeyCake.taste();
		System.out.println(honeyCake.isHoney());
		honeyCake.setHoney(true);
		System.out.println(honeyCake.isHoney());
		
		
	}

}
