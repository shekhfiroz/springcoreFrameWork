package com.main.coreioc.test;
import com.main.coreioc.beans.HtmlMesasge;
import com.main.coreioc.beans.PdfMessage;
public class MessageTest {
	public static void main(String[] args) {
		 HtmlMesasge htmlMesasge = new HtmlMesasge();
		 String cmessage=htmlMesasge.convert("I am in html");
//		PdfMessage pdfMessage = new PdfMessage();
//		String msg = pdfMessage.convert("I am from test Message");
		System.out.println(cmessage);
	}
}
