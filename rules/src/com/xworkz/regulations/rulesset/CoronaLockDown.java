package com.xworkz.regulations.rulesset;

public interface CoronaLockDown {
	public static final String country="INDIA";
	
	public abstract int socialDistance();
	public abstract void wearMask();
	public abstract String sanitiser();

}
