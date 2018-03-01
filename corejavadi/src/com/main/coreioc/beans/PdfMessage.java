package com.main.coreioc.beans;

public class PdfMessage implements IMessageConvert {
	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
