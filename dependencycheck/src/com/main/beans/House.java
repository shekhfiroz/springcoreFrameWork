package com.main.beans;

public class House {
	private HouseTax housetax;;
	private String houseno;
	private String loction;
	private String area;
	public void setHousetax(HouseTax housetax) {
		this.housetax = housetax;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public void setLoction(String loction) {
		this.loction = loction;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "House [housetax=" + housetax + ", houseno=" + houseno + ", loction=" + loction + ", area=" + area + "]";
	}

	
}