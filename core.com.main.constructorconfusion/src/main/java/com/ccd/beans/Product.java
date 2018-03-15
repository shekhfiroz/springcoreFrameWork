package com.ccd.beans;

public class Product {
	private String product_item;
	private String description;
	private float amount;

	public Product(String product_item, float amount) {
		super();
		this.product_item = product_item;
		this.amount = amount;
	}

	public Product(String product_item, String description) {
		super();
		this.product_item = product_item;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [product_item=" + product_item + ", description=" + description + ", amount=" + amount + "]";
	}

}
