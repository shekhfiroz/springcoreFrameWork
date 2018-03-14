package com.fsp.beans;

public class HtmlMessageWriterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<Html><body>" + message + "</Html></body>";
	}

}
