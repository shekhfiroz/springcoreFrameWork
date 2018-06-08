package com.main.bean;

public class MyThread {
	public int a = 10;

	public void increase() {
		for (int i = 0; i < 5; i++) {
			System.out.println("increased by--->  " + (a + i));
		}
	}

	public void decrease() {
		for (int i = 0; i < 5; i++) {
			System.out.println("decreased by --->  " + (a - i));
		}

	}

}
