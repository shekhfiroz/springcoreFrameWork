package com.main.factoryhelper;

import com.main.corefactorymethod.HtmlMessageWriterImpl;
import com.main.corefactorymethod.IMessageWriter;
import com.main.corefactorymethod.PdfMessageWriterImpl;

public class MessageWriterFactory {
	public static IMessageWriter createMessageWriter(String type) {
		if (type.equals("html")) {
			return new HtmlMessageWriterImpl();
		} else if (type.equals("pdf")) {
			return new PdfMessageWriterImpl();
		}
		return null;

	}

}