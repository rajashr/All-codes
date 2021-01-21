package com.xworkz.events.custom;

public class ExceptionThrower {
	public void checked() throws CustomCheckedException {
		throw new CustomCheckedException(); //event created but until u throw it is not an exceptional event looks for handler
	}

	public void unchecked() {
		throw new CustomUncheckedException();//as it is unchecked compiler wont force u to handle
	}

}
