package com.i18n.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetHindiNameServlet")
public class GetHindiNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set spanish language code.
		response.setHeader("Content-Language", "zh_CN");

		Enumeration<Locale> locales = request.getLocales();
		System.out.println(locales);
		String fname = request.getParameter("fname");
		System.out.println("fname===>" + fname);
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		// Set spanish language code.
		response.setHeader("Content-Language", "hi");

		// response.setContentType("text/html,charset=UTF-16");
		writer.println(fname);
		Connection con = null;
		// PreparedStatement preparedStatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///servletmvc", "root", "root");
			Statement stmt = con.createStatement();
			/*
			 * String query = "insert into hinditable (fname) values (?)"; preparedStatement
			 * = con.prepareStatement(query); preparedStatement.setString(1, fname); int i =
			 * preparedStatement.executeUpdate(); System.out.println("i the value is>>>" +
			 * i);
			 */
			ResultSet rs = stmt.executeQuery("select * from hinditable");

			while (rs.next())
				System.out.println(rs.getString(1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
