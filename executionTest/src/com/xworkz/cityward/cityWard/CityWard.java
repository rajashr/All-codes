package com.xworkz.cityward.cityWard;

import com.xworkz.cityward.constants.WardNames;

public class CityWard {
	private CityWardInfo cityWardInfo;

	public CityWard() {
		super();
	}

	



	public void displayCorporator(int number) {
		if (number != 0) {
			this.cityWardInfo = new CityWardInfo(number);
			System.out.println("corporator Name" + this.cityWardInfo.getCorporatorName());
		} else {
			System.out.println("corporator is not there");
		}

	}

	public void cityWardInformation(WardNames wardName, int wardNumber, long population) {
		if (wardName != null && wardNumber != 0) {
			if (population > 5000) {
				this.cityWardInfo = new CityWardInfo(wardName, wardNumber, population);
			} else {
				System.out.println("minimum population is not there");
			}
		} else {
			System.out.println("ward name is not present");
		}
	}

	public void displayInfo() {
		if (cityWardInfo != null) {
			System.out.println(cityWardInfo.getWardNumber());
			System.out.println(cityWardInfo.getPopulation());
			System.out.println(cityWardInfo.getCorporatorName());
			System.out.println(cityWardInfo.getAreaInSq());
			System.out.println(cityWardInfo.getWardName());
		} else {
			System.out.println("ward is not found");
		}
	}
	
	public void cityInfo(CityWardInfo dto) {
		this.cityWardInfo = dto;

	}
	public void displayByName(WardNames name) {
		if(this.cityWardInfo!=null) {
	
		WardNames tempWards=this.cityWardInfo.getWardName();
		if(tempWards.equals(name)){
			if(this.cityWardInfo!=null) {
			System.out.println(this.cityWardInfo.getWardNumber());
			}else {
				System.out.println("ward number cannot be null");
			}
		}else {
			System.out.println("ward is not there");
		}
	
	}
	}

}
