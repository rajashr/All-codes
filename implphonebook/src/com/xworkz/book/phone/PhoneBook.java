package com.xworkz.book.phone;

public class PhoneBook{
	// what are all properties a phone book may have
	private String name;
	private int code;

	public PhoneBook(String name, int code) {
		super();
		this.name = name;
		this.code = code;
	}

	public PhoneBook() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(int code) {
		this.code = code;
	}

	// lets override hashcode toString and equals
	@Override
	public String toString() {
		return "PhoneBook [name=" + name + ", code=" + code + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				System.out.println("objects are  same");
				return true;

			} else {
				// as the type of obj is Object we can pass even any String also as we have
				// equality factor now we have to make sure
				// it is of type phoneBook lets do type casting
				if (obj instanceof PhoneBook) {
					PhoneBook childRef = (PhoneBook) obj;
					if (this.name.equals(childRef.name)) {
						System.out.println("name is same");
						return true;

					}
				}

			}
		}
		System.out.println("object is  not same");
		return false;
		

	}
	@Override
	public int hashCode() {
		return 50;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
