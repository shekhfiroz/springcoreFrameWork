package com.main.runnable;

public class MyThread {
	private static MyThread instance;

	private MyThread() {
		System.out.println("I am in con" + "  " + Thread.currentThread().getName());
	}

	public synchronized static MyThread getInstance() {

		if (instance == null) {
			instance = new MyThread();
			//System.out.println(instance.hashCode());
		}
		return instance;

	}

}
