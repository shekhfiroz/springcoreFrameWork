package com.main.cdi.beans;

public class HtmlMessageWriterImpl implements IMessageWriter {
	public String messageconverter(String message) {
		return "<Html></body>" + message + "</body></Html>";
	}
}
