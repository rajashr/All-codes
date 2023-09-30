package car;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		System.out.println("Add car");
		System.out.println("view car");
		System.out.println("update car");
		System.out.println("delete car");
		
		//when user enters 1 switch case one will be executed which saves the car details in db
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int c=sc.nextInt(); //integer can accept num not enetr character
		sc.nextLine();
	//	String i="1"
			//	 +"";
		//dummy sc.nextline is needed if you use sc.nextInt and leter you want to use nexlIne
		UtilityCon con=new UtilityCon();
		
		switch(c){
		case 1:{
			System.out.println("eneter car name");
			String name=sc.nextLine();
			System.out.println("eneter car name");
			double price=sc.nextDouble();
			System.out.println("eneter car name");
			sc.nextLine();
			String color=sc.nextLine();
			boolean res=con.saveCar(name, price, color);
			if(res) {
				System.out.println("added");
			}
				
			}
				
				
		}
	}

}
