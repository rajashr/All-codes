package com.xworkz.online;

import com.xworkz.online.ground.Vehicle;

public class TesterVehicle {

	public static void main(String[] args) {
	 Vehicle ref=new Vehicle();
	 ref.color="black";
	 ref.model="car";
	 ref.owner="rani";
	 ref.displayInfo();
	 //we can get access to instance methods and variables using ref variable
	 
	 Vehicle ref2=new Vehicle();
	 ref2.color="blue";
	 ref2.model="Royal";
	 ref2.displayInfo();
	 

	}

}
