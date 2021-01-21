package com.xworkz.bakery.browser;

public class TesterFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object generic=new FireFox(); 
		
		Browser browser=new FireFox();
		
		FireFox fireFox=new FireFox();
		
		generic=new String("test");
		
		//if(generic instanceof FireFox) {
			//System.out.println("yes it is firefox");
			FireFox fireFoxCasted=(FireFox)generic;
			System.out.println(fireFoxCasted.getName());
		//}else {
			//System.out.println("it is not fireFox");
		//}

	}

}
