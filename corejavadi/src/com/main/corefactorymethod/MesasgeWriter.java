package com.main.corefactorymethod;

import com.main.factoryhelper.*;

public class MesasgeWriter {
	public String messageWriter(String message) {
		MessageWriterFactory messageWriterFactory = new MessageWriterFactory();
		IMessageWriter cmessage = MessageWriterFactory.createMessageWriter("html");
		System.out.println(cmessage);
		return message;

	}

}
