package com.main.threading;

public class Threadclass3 extends Thread {
	MailSend mailing;

	public Threadclass3(MailSend mailing) {
		this.mailing = mailing;
	}

	public void run() {
		mailing.mailProcessing(300);
	}

}
