package com.main.singletondp;

public class Processor1 {
	private static Processor1 instance;

	private Processor1() {
		System.out.println("contructor-running");
	}

	public static Processor1 getcal() {
		System.out.println("instance==>>" + instance);
		if (instance == null) {
			instance = new Processor1();
			// System.out.println(instance.hashCode());
		}
		return instance;
	}
	// creating object without main method
	/*
	 * static { Processor1.cal(); }
	 */
}
