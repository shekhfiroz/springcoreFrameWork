package com.main.corefactorymethod;

public class HtmlMessageWriterImpl implements IMessageWriter {
	@Override
	public String convert(String message) {
		return "<html>" + message + "</html>";
	}

}
