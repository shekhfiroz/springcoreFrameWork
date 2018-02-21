package com.main.coreioc.HtmlMessageImpl;

import com.main.coreioc.interfa.IMessageConvert;

public class HtmlMesasge implements IMessageConvert {

	@Override
	public String convert(String message) {
		return "<Html>" + message + "</Html>";
	}

}
