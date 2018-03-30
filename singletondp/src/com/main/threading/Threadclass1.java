package com.main.threading;

public class Threadclass1 extends Thread {
	MailSend mailing;
	public Threadclass1(MailSend mailing) {
		this.mailing=mailing;
	}
	public void run() {
		mailing.mailProcessing(5);
	}


}
