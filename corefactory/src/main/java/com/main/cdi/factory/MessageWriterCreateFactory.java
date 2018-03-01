package com.main.cdi.factory;

import com.main.cdi.beans.HtmlMessageWriterImpl;
import com.main.cdi.beans.IMessageWriter;
import com.main.cdi.beans.PdfMessageWriterImpl;
import com.main.cdi.beans.TextMessageWriterImpl;

public class MessageWriterCreateFactory{
	
	public static IMessageWriter getMessageclass(String type) {
		IMessageWriter messageWrite;
		if(type.equals("html"))
			return new HtmlMessageWriterImpl();
		else if(type.equals("pdf"))
			return new PdfMessageWriterImpl();
		else if(type.equals("text"))
			return new TextMessageWriterImpl();
		else 
			return new HtmlMessageWriterImpl();
	}

}
