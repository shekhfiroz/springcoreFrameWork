package com.main.cdi.beans;

public class MessageWriter {
	IMessageWriter messagewriter;
	public void writeMessage(String message) {
		System.out.println("Before Conversion...1" + message);
		
		String cMessage = messagewriter.messageconverter(message);
		System.out.println("After Conversion...3" + cMessage);
	}
	public void setMessagewriter(IMessageWriter messagewriter) {
		this.messagewriter = messagewriter;
	}
}