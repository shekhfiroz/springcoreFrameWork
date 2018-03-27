package com.bi.beans;

public class Car {
	private String name;
	private String color;
	private String company;
	private String carType;
	private float price;

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", company=" + company + ", carType=" + carType + ", price="
				+ price + "]";
	}

}
