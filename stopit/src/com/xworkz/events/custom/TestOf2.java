package com.xworkz.events.custom;

public class TestOf2 extends TestOf1{
	public TestOf2() {
		super(2);
		//System.out.println("subclass parameterised constructor");
	}
	public TestOf2(String message) {
		super(message);
	}
	public void display() {
		System.out.println("invoked display hello");
	}

}
