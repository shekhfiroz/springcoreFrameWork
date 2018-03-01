package com.main.cdi.beans;
public class PdfMessageWriterImpl  implements IMessageWriter{

	@Override
	public String messageconverter(String message) {
		System.out.println("2...");
		return "<pdf>"+message+"</pdf>";
	}

}
