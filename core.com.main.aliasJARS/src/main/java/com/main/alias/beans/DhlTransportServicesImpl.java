package com.main.alias.beans;

public class DhlTransportServicesImpl implements ITransport {

	@Override
	public String shipping(int zipcode) {
		return "dhl";

	}

}
