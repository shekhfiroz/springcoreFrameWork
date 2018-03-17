package com.ccd.beans;

//we have to create two constructor to inject object of a class,
public class Product {
	private String product_item;
	private String description;
	private int amount;
	
	public Product(String product_item, int amount) {
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
