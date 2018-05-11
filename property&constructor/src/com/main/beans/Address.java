
package com.main.beans;

public class Address {

	private Area area;
	private String addresline1;
	private String addressline2;
	private String city;
	private String State;
	private String country;

	public void setArea(Area area) {
		this.area = area;
	}

	public void setAddresline1(String addresline1) {
		this.addresline1 = addresline1;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		State = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", addresline1=" + addresline1 + ", addressline2=" + addressline2 + ", city="
				+ city + ", State=" + State + ", country=" + country + "]";
	}

}
