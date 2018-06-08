package com.main.emicalulator;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

@WebServlet("/BrowseLoanServlet")
public class BrowseLoanServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loantype = request.getParameter("loantype");
		int loanamount = Integer.parseInt(request.getParameter("loanamount"));
		int tenure = Integer.parseInt(request.getParameter("tenure"));
		String place = request.getParameter("place");
		String occupation = request.getParameter("job");
		Connection conn = null;
		PreparedStatement pstmt = null;
		double interest_rate = 0.0;
		double interest_amount = 0.0;
		double repayment_amount = 0.0;
		double emi = 0.0;

		System.out.println(loanamount + " " + tenure + " " + place + " " + occupation + " " + loantype);

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/servletmvc", "root", "root");
			pstmt = (PreparedStatement) conn.prepareStatement(
					"select interest from loanparameter where loan_type=? and (min_principle_amount<=? and max_principle_amount>=?) and (min_tenure<=? and max_tenure>=?) and place=?");

			pstmt.setString(1, loantype);
			pstmt.setInt(2, loanamount);
			pstmt.setInt(3, loanamount);
			pstmt.setInt(4, tenure);
			pstmt.setInt(5, tenure);
			pstmt.setString(6, place);
			System.out.println(pstmt);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				interest_rate = rs.getDouble("interest");
				System.out.println(interest_rate);
				interest_amount = loanamount * interest_rate * tenure / 100;
				System.out.println(interest_amount);
				repayment_amount = interest_amount + loanamount;
				System.out.println(repayment_amount);
				emi = repayment_amount / tenure;
				System.out.println(emi);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("interest_rate",interest_rate);
		request.setAttribute("interest_amount",interest_amount);
		request.setAttribute("repayment_amount",repayment_amount);
		request.setAttribute("emi",emi);

		request.getRequestDispatcher("/sucess.jsp").forward(request, response);

	}
}