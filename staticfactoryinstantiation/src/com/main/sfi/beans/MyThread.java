package com.main.sfi.beans;

public class MyThread extends Thread {
	Processor p;

	@Override
	public void run() {
		System.out.println(p.getInstance() + " ----->>>" + Thread.currentThread().getName());

	}
}
