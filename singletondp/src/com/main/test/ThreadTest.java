package com.main.test;

import com.main.threading.MailSend;
import com.main.threading.Threadclass1;
import com.main.threading.Threadclass2;
import com.main.threading.Threadclass3;

public class ThreadTest {

	public static void main(String[] args) {

		MailSend send = new MailSend();
		Threadclass1 t1 = new Threadclass1(send);
		

		Threadclass2 t2 = new Threadclass2(send);
		

		Threadclass3 t3 = new Threadclass3(send);
		t1.start();
		t2.start();
		t3.start();

	}

}
