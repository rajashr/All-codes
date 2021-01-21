package com.xworkz.cityward;

import com.xworkz.cityward.cityWard.CityWard;
import com.xworkz.cityward.cityWard.CityWardInfo;
import com.xworkz.cityward.constants.WardNames;

public class CityWardTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityWard cityward=new CityWard();
		cityward.cityWardInformation(null, 0, 4500);
		cityward.displayInfo();
		CityWardInfo dto=new CityWardInfo(WardNames.GHANDINAGAR, 56467,689865l);
		cityward.displayByName(WardNames.GHANDINAGAR);
		cityward.displayByName(WardNames.MANAHANTHNAGAR);
		CityWardInfo dto2=new CityWardInfo(WardNames.JAYANAGAR, 56378, "Govind", 6789868l, 199.05);
		cityward.displayByName(WardNames.GHANDINAGAR);
		cityward.displayCorporator(56378);
		
	

	}

}
