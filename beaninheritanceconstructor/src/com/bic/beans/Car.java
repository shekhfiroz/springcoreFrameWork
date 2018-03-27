package com.bic.beans;

import java.beans.ConstructorProperties;

public class Car {
	private String name;
	private String color;
	private String company;
	private String carType;
	private float price;
	
    @ConstructorProperties({"name","color","company","carType","price"})
	public Car(String name, String color, String company, String carType, float price) {
		this.name = name;
		this.color = color;
		this.company = company;
		this.carType = carType;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", company=" + company + ", carType=" + carType + ", price="
				+ price + "]";
	}

}
