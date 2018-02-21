package com.main.coreioc.PdfMessageImpl;

import com.main.coreioc.interfa.IMessageConvert;

public class PdfMessage implements IMessageConvert {
	@Override
	public String convert(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
