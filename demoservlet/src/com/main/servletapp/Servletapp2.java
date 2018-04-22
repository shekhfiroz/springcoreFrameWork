package com.main.servletapp;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servletapp2")
public class Servletapp2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servletapp2() {
		super();
	}

	public void service(HttpServletRequest request, HttpServletResponse response) {
		Processor processor = null;
		processor = processor.getInstances();
		try {
			response.getWriter().print(processor.hashCode());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
