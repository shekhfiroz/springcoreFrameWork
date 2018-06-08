package com.main.test;

import com.main.runnable.RunnableThread;

public class Test {

	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		Thread th1 = new Thread(rt);
		th1.start();
		
		Thread th2 = new Thread(rt);
		th2.start();
	}

}
