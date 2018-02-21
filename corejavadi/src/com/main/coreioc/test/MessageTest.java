package com.main.coreioc.test;

import com.main.coreioc.PdfMessageImpl.PdfMessage;

public class MessageTest {
	public static void main(String[] args) {
		// HtmlMesasge htmlMesasge = new HtmlMesasge();
		PdfMessage pdfMessage = new PdfMessage();
		String msg = pdfMessage.convert("I am from test Message");
		System.out.println(msg);
	}
}
