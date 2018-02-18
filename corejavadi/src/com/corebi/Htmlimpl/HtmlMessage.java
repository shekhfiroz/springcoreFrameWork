package com.corebi.Htmlimpl;

import com.corebi.imessage.IMessage;

public class HtmlMessage implements IMessage {


	@Override
	public String convertMessage(String msg) {
		// TODO Auto-generated method stub
		return  "<Html>" +msg+ "<html>";
	}

}
