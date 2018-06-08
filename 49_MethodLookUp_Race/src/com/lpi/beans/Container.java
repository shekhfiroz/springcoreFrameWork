package com.lpi.beans;

public abstract class Container {

	public void requestHandler(String data) {
		RequestHandler requestHandler = null;
		requestHandler = lookupRequestHandler();
		requestHandler.process(data);
	}

	public abstract RequestHandler lookupRequestHandler();

}
