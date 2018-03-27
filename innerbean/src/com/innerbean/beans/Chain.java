package com.innerbean.beans;

public class Chain {
	private String chainnum;
	private String brand;

	public void setChainnum(String chainnum) {
		this.chainnum = chainnum;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Chain [chainnum=" + chainnum + ", brand=" + brand + "]";
	}

}
