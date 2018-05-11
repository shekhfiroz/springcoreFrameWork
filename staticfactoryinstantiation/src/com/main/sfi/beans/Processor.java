package com.main.sfi.beans;

public class Processor {
	private static Processor instance;

	private Processor() {
		// no operation
	}

	public static Processor getInstance() {
		if(instance==null) {
			instance = new Processor();
		}
		return instance;
	}
/*//	public static void main(String[] args) {
//		Processor p1 = Processor.getInstance();
//		System.out.println(p1.hashCode());
//		Processor p2 = Processor.getInstance();
//		System.out.println(p2.hashCode());
//		Processor p3 = Processor.getInstance();
//		System.out.println(p3.hashCode());
//	}
*/}