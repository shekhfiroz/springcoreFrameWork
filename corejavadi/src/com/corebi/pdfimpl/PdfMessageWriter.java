package com.corebi.pdfimpl;

import com.corebi.imessage.IMessage;

public class PdfMessageWriter implements IMessage {
	@Override
	public String convertMessage(String msg) {
		// TODO Auto-generated method stub
		return "<pdf>"+msg+"<pdf>";
	}

}
