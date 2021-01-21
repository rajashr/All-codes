package com.xworkz.cityward;

import com.xworkz.cityward.DTO.CityWardDTO;
import com.xworkz.cityward.citywards.CityWard;
import com.xworkz.cityward.constants.WardNames;

public class CityWardTester {

	public static void main(String[] args) {
		CityWard cityWard=new CityWard();
		CityWardDTO dto=new CityWardDTO(4556, WardNames.GHANDINAGAR, "Harish", 400, 5);
		cityWard.addCityWardInfo(dto);
		cityWard.displayWardInfo();

	}

}
