package com.main.emicalulator;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BrowseLoanServlet")
public class BrowseLoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String loantype = request.getParameter("loantype");
		String lonamount = request.getParameter("loanamount");
		String tenure = request.getParameter("tenure");
		String place = request.getParameter("place");
		String occupation = request.getParameter("occupation ");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///servletmvc", "root", "root");
			System.out.println(con);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select loanparameter where tenure=" +tenure);

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			try {
				stmt.close();
			} catch (Exception e) {
				System.out.println("stmt.close();");
				e.printStackTrace();
			}

		} catch (Exception e) {
		}
	}
}