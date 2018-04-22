package com.main.servletapp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servletapp1")
public class Servletapp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servletapp1() {
		super();
	}

	public void service(HttpServletRequest request, HttpServletResponse response) {
		Processor processor = null;
		processor = processor.getInstances();
		try {
			response.getWriter().print(processor.hashCode());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
