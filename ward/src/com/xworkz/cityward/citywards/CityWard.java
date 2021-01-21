package com.xworkz.cityward.citywards;

import com.xworkz.cityward.DTO.CityWardDTO;

public class CityWard {
	private CityWardDTO[] cityWard=new CityWardDTO[5] ;
	int currentIndex=0;
	public CityWard() {
		super();
	}
	public void addCityWardInfo(CityWardDTO dto) {
		if(currentIndex<5 && dto!=null ) {
			if(dto.getWardNumber()!=0 && dto.getWardName()!=null && dto.getPopulation()>5000) {
		this.cityWard[currentIndex]=dto;
		this.currentIndex++;
			}else {
				System.out.println("provide valid data for name,number and population");
			}
		}else {
			System.out.println("index should be lesser than 5");
		}
		
	}
	public void displayWardInfo() {
		
		
		for(int i=0;i<this.cityWard.length;i++) {
			 CityWardDTO dto=this.cityWard[i];
			 if(dto!=null) {
			 System.out.println(dto);
			 System.out.println(dto.getAreaInSqKm());
			 System.out.println(dto.getCorporatorname());
			 System.out.println(dto.getPopulation());
			 System.out.println(dto.getWardNumber());
			 System.out.println(dto.getWardName());
			 break;
			 }else {
				 System.out.println("ward is not there");
				 break;
			 }
			
		}
	}
	

}
