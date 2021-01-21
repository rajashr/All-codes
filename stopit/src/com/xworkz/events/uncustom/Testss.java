package com.xworkz.events.uncustom;

import com.xworkz.events.custom.Test;

public class Testss extends Test {
	//to invoke parent class constructor
	String name;
	public Testss() {
		super();
		System.out.println("created testsss");
	}
	//to reuse parent constructor
	public Testss(String name) {
		//super(name,USN);
		System.out.println("created parameterised constructor");
		this.name=name;
		
	}
	//super is the first statement in the constructor of child class so first super is excuted default constructor of parent is exce
	//executed then other so always a first statement in child constructor is super

}
