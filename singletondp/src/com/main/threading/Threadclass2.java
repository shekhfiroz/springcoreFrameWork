package com.main.threading;

public class Threadclass2 extends Thread {

	MailSend mailing;
	
	public Threadclass2(MailSend mailing) {
		super();
		this.mailing = mailing;
	}

	public void run() {
		mailing.mailProcessing(100);
	}
}
