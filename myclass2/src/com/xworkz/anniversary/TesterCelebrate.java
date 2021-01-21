package com.xworkz.anniversary;

import static com.xworkz.anniversary.clebrate.Party.join;
import static com.xworkz.anniversary.clebrate.Event.team;


public class TesterCelebrate {

	public static void main(String[] args) {
		team();
		join();
		com.xworkz.anniversary.festival.Event.hurray(); //inline import is  used
		//when two packages having same class name to tell java i want this particular method from this package 
team();//we can use static import sattaement to call the methods without using class name

	}

}
