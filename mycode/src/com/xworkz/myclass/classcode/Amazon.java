package com.xworkz.myclass.classcode;

public class Amazon {
	public static  String[] items= {"mobile","tshirt","pants","trousers","chudidars","wallets","laptop","earphones"};
	
	public static void search(String product) {
		//whoever call this meyhod they give the product name like when we shop in a site we put product we want in search bar
		System.out.println("invoked search");
		System.out.println("total products :"+items.length);
		System.out.println("product you searched for :"+product);
		//for loop is used for searching and for comparing with values
		//and if we want to display all values in an array we use for loop
		for(int i=0;i<items.length;i++) {
			
			System.out.println(items[i]);
			String name=items[i];
			if(product.equals(name)) {
				System.out.println("item is found");
				break;
			}else {
				System.out.println("item is not found");
			}
		}
		
		System.out.println("exit search");
	}

}
