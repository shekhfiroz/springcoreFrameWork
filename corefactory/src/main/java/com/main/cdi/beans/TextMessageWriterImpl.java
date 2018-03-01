package com.main.cdi.beans;

public class TextMessageWriterImpl implements IMessageWriter {

	@Override
	public String messageconverter(String message) {
		return "<text>"+message+"</text>";
	}

}
