package com.main.singletondp;

public class Processor {

	private static  Processor instance=null;

	public Processor() {
		System.out.println("Processor...");
	}

	public static  Processor createObject() {
		System.out.println("instance===>>"+instance);
		if (instance == null) {
			instance = new Processor();
			System.out.println("instance===>>"+instance);
			
		}
		return instance;

	}

	public static  Processor createObject1() {
		System.out.println("instance===>>"+instance);
		if (instance == null) {
			instance = new Processor();
			System.out.println("instance===>>"+instance);
			
		}
		return instance;

	}

	
	
}
