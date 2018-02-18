package com.corebi.test;

import com.corebi.beans.MessageWriter;

public class MessageTest extends MessageWriter {

	public static void main(String[] args) {
		MessageWriter messagewriter = new MessageWriter();
		System.out.print(messagewriter.writemessage("I am from Pdf message Writer"));

	}

}
