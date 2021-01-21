package com.xworkz.myclass;

import com.xworkz.myclass.DTO.KeyDTO;
import com.xworkz.myclass.classcode.HexKeyPad;

public class KeyTester {

	public static void main(String[] args) {
		HexKeyPad ref2=new HexKeyPad();
		KeyDTO ref=new KeyDTO("on"," off");
		ref2.pressKey(ref, 4);
		

	}

}
