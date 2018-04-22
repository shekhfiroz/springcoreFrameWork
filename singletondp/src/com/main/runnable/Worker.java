package com.main.runnable;

public class Worker implements Runnable{

	@Override
	public void run() {
		MyThread mythread =null;
				mythread=MyThread.getInstance();
		
		System.out.println(mythread.hashCode());
	}

}
