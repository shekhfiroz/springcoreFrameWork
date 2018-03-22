package com.main.alias.beans;

public class BlueDartTransportServiceImpl implements ITransport {
 
	@Override
	public String shipping(int zipcode) {
		return "bluedart";
		
	}

}
