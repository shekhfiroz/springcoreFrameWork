package com.main.servletapp;

public class Processor {
	private static Processor instance;

	public Processor() {
		// no operation
	}

	public static Processor getInstances() {
		if (instance == null) {
			instance = new Processor();
		}
		return instance;
	}

}