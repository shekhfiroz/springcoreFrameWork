package com.main.alias.beans;

public class TransportServices {
	ITransport shsi;
	ITransport bdsi;

	public TransportServices(ITransport bdsi, ITransport shsi) {
		super();
		this.bdsi = bdsi;
		this.shsi = shsi;
	}

	public ITransport dispatch(int zipcode) {
		if (zipcode < 500) {
			return new BlueDartTransportServiceImpl();
		} else
			return new DhlTransportServicesImpl();
	}
}
