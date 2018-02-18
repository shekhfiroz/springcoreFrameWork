package com.corebi.beans;
import com.corebi.imessage.IMessage;
import com.corebi.pdfimpl.PdfMessageWriter;

public class MessageWriter {
	IMessage imessage;

	public String writemessage(String msg) {
		imessage = new PdfMessageWriter();
		return imessage.convertMessage(msg);

	}

}
