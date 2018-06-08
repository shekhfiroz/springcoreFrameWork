package com.lpi.beans;

public class RequestHandler {

	public void process(String data) {
		System.out.println("Processing " + this.hashCode() + " " + data);
	}
}
