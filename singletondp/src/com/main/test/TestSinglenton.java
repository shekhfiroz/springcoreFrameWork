package com.main.test;

import com.main.runnable.Worker;

public class TestSinglenton {

	public static void main(String[] args) throws Exception {
		// MyThread.getInstance();
		Worker worker = new Worker();
		Thread th = new Thread(worker);// u
		// th.sleep(3000);
		Thread th1 = new Thread(worker);// srikant

		// System.out.println(th);
		th.start();
		System.out.println("srinu" + " " + th.currentThread().hashCode());
		// th1.currentThread().setName("srikanta");
		th1.start();
		System.out.println("srikanta" + " " + th1.currentThread().hashCode());
		th1.join();
		//th.join();

		/*
		 * Thread th1=new Thread(worker); //System.out.println(th); th1.start();
		 * 
		 * Thread th2=new Thread(worker); //System.out.println(th); th2.start();
		 */

	}

}
