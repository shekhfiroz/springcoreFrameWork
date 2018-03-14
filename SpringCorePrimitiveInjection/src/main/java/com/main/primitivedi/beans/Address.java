package com.main.primitivedi.beans;

public class Address {
	//attributes
	private String AddressLine1;
	private String AddressLine2;
	private String city;
	private String zipcode;
	private String State;
	private String country;
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", city=" + city
				+ ", zipcode=" + zipcode + ", State=" + State + ", country=" + country + "]";
	}


}
