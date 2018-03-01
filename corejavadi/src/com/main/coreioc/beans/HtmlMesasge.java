package com.main.coreioc.beans;

public class HtmlMesasge implements IMessageConvert {

	@Override
	public String convert(String message) {
		return "<Html>" + message + "</Html>";
	}

}
