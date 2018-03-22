package com.main.alias.beans;

public class TransportServices {
	ITransport dhlsi;
	ITransport bdsi;

	public TransportServices(ITransport bdsi, ITransport dhlsi) {
		super();
		this.bdsi = bdsi;
		this.dhlsi = dhlsi;
	}

	public String dispatch(int zipcode) {
		if (zipcode <= 506) {
			String dhl = dhlsi.shipping(zipcode);
			System.out.println(dhl);
		} else {
			String bluedart = bdsi.shipping(zipcode);
			System.out.println(bluedart);
		}
		return null;
	}
}
