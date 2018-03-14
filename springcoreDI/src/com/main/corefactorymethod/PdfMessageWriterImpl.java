package com.main.corefactorymethod;

public class PdfMessageWriterImpl implements IMessageWriter {

	@Override
	public String convert(String message) {
		return "<pdf>"+message+"</pdf>";
	}

}
