package com.xworkz.cityward.cityWard;

import com.xworkz.cityward.constants.WardNames;

public class CityWardInfo {
		
		private WardNames wardName;
		private int wardNumber;
		private String corporatorName;
		private long population;
		private double areaInSq;
		public CityWardInfo(int wardNumber) {
			System.out.println("parameterised constructor");
		}
		
		public CityWardInfo(WardNames wardName, int wardNumber, long population) {
			super();
			this.wardName = wardName;
			this.wardNumber = wardNumber;
			this.population = population;
		}


		public CityWardInfo(WardNames wardName, int wardNumber, String corporatorName, long population, double areaInSq) {
			super();
			this.wardName = wardName;
			this.wardNumber = wardNumber;
			this.corporatorName = corporatorName;
			this.population = population;
			this.areaInSq = areaInSq;
		}


		public WardNames getWardName() {
			return wardName;
		}


		public void setWardName(WardNames wardName) {
			this.wardName = wardName;
		}


		public int getWardNumber() {
			return wardNumber;
		}


		public void setWardNumber(int wardNumber) {
			this.wardNumber = wardNumber;
		}


		public String getCorporatorName() {
			return corporatorName;
		}


		public void setCorporatorName(String corporatorName) {
			this.corporatorName = corporatorName;
		}


		public long getPopulation() {
			return population;
		}


		public void setPopulation(long population) {
			this.population = population;
		}


		public double getAreaInSq() {
			return areaInSq;
		}


		public void setAreaInSq(double areaInSq) {
			this.areaInSq = areaInSq;
		}
		

	}



