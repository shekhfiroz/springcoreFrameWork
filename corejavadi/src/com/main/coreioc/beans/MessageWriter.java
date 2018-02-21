package com.main.coreioc.beans;

import com.main.coreioc.PdfMessageImpl.PdfMessage;
import com.main.coreioc.interfa.IMessageConvert;

public class MessageWriter {
	IMessageConvert messageconvert;

	public String messagewriter(String message) {
		messageconvert = new PdfMessage();
		messageconvert.convert(message);
		return message;

	}

}
