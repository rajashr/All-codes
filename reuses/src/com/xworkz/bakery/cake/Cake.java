package com.xworkz.bakery.cake;

public class Cake {
	private String flavour;
	private double size;
	private String shape;
	
	//lets write one method
	public boolean taste() {
		boolean tasteGood=true;
		System.out.println("invoked taste");
		
		
		return tasteGood;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
