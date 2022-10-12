package com.yash.assignment2.seventh;

public class Athletic 
{
	
	int aId;
	String name;
	String address;
	String dob;
	
	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Athletic(int aId, String name, String address, String dob) {
		super();
		this.aId = aId;
		this.name = name;
		address = address;
		this.dob = dob;
	}
	
	
}
