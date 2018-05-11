package com.main.beans;

public class HouseTax {

	private String uanno;
	private String taxamount;

	public String getUanno() {
		return uanno;
	}

	public void setUanno(String uanno) {
		this.uanno = uanno;
	}

	public String getTaxamount() {
		return taxamount;
	}

	public void setTaxamount(String taxamount) {
		this.taxamount = taxamount;
	}

	@Override
	public String toString() {
		return "HouseTax [uanno=" + uanno + ", taxamount=" + taxamount + "]";
	}
	
	
}
