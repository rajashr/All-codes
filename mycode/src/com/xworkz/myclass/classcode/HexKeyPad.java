package com.xworkz.myclass.classcode;

import com.xworkz.myclass.DTO.KeyDTO;

public class HexKeyPad {
	private KeyDTO key;
	
	//private int[] keys= {1,2,3,4,5,6,7,8,9};
	
	public void pressKey(KeyDTO dto,int keyu) { //whoever calls this method they have to pass arg which is of type ketDto
		this.key=dto;//dto is nothing but a reference of KeyDTO as we get access to instance variable by using reference 
		//now we can get access to instance variables
		
		if(dto!=null) {
			int[] u=this.key.getKeys();
			System.out.println(this.key.getKeys());
		for(int i=0;i<=u.length;i++) {
			// int[] u=this.key.getKeys();
			 int unique=u[i];
			 if(keyu==unique) {
				 System.out.println("press the key");
			 }else {
				 System.out.println("dont press the key");
			 }
			 
			
			
		}
		}
	}
	

}
