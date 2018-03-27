package com.innerbean.beans;

public class Bbycycle {
	private String bycycle;
	private String manufacturer;
	private Chain chain;

	public void setBycycle(String bycycle) {
		this.bycycle = bycycle;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	@Override
	public String toString() {
		return "Bbycycle [bycycle=" + bycycle + ", manufacturer=" + manufacturer + ", chain=" + chain + "]";
	}

}
