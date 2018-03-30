package com.main.threading;

public class MailSend {
	public  void mailProcessing(int n) {
		
		synchronized(this) {
		for (int i = 1; i < 2; i++) {
			try {
				Thread.sleep(300);
				System.out.println(n * i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}}
	}}
	

