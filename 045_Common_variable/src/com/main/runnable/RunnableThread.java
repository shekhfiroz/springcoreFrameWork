package com.main.runnable;
import com.main.bean.MyThread;

public class RunnableThread implements Runnable {
	MyThread mt = new MyThread();
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("--------");
			mt.increase();
			System.out.println("--------");
			mt.decrease();
		}
	}
}
