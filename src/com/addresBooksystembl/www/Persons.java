package com.addresBooksystembl.www;

public class Persons {
	public  String name;
	private String address;
	private String phoneNumber;
	private String city;
	private String lastName;
	private String state;
	private String ZipCode;

	public Persons(String name, String address, String phoneNumber, String lastName, String State, String ZipCode,
			String city) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", city=" + city
				+ ", lastName=" + lastName + ", state=" + state + ", ZipCode=" + ZipCode + "]";
	}

}
