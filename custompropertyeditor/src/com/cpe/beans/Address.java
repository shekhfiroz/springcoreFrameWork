package com.cpe.beans;

public class Address {
	public Address() {
	}

	private String building;
	private String street;
	private String city;
	private Integer zip;
	private String country;
	private GeoLocation geolocation;

	/**
	 * @param building
	 * @param street
	 * @param city
	 * @param zip
	 * @param country
	 * @param geolocation
	 */
	public Address(String building, String street, String city, Integer zip, String country, GeoLocation geolocation) {
		super();
		this.building = building;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
		this.geolocation = geolocation;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoLocation getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(GeoLocation geolocation) {
		this.geolocation = geolocation;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + ", street=" + street + ", city=" + city + ", zip=" + zip + ", country="
				+ country + ", geolocation=" + geolocation + "]";
	}

}
