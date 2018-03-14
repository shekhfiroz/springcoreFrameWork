package com.fsp.beans;

public class PdfMessageWriterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<Pdf>" + message + "</Pdf>";
	}

}
