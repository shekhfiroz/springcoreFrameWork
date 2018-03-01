package com.main.cdi.beans;

import com.main.cdi.factory.MessageWriterFactory;

public class TestCore {
	public static void main(String[] args) throws Exception {
		MessageWriter writter = (MessageWriter) MessageWriterFactory.createMessageWriterFactory("messagewriter.class");
		IMessageWriter msgConverter = (IMessageWriter) MessageWriterFactory
				.createMessageWriterFactory("messageconverter.class");

		writter.setMessagewriter(msgConverter);

		writter.writeMessage("Welcom To Spring Core...");
	}
}
