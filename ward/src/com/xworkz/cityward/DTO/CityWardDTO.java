package com.xworkz.cityward.DTO;

import com.xworkz.cityward.constants.WardNames;

public class CityWardDTO {
	private int wardNumber;
	private WardNames wardName;
	private String corporatorname;
	private long population;
	private int areaInSqKm;
	public CityWardDTO(int wardNumber, WardNames wardName, String corporatorname, long population, int areaInSqKm) {
		super();
		this.wardNumber = wardNumber;
		this.wardName = wardName;
		this.corporatorname = corporatorname;
		this.population = population;
		this.areaInSqKm = areaInSqKm;
	}
	public int getWardNumber() {
		return wardNumber;
	}
	public WardNames getWardName() {
		return wardName;
	}
	public String getCorporatorname() {
		return corporatorname;
	}
	public long getPopulation() {
		return population;
	}
	public int getAreaInSqKm() {
		return areaInSqKm;
	}
	public CityWardDTO() {
		super();
	}
	
	

}
