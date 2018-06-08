<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Emi Calulator</title>
</head>
<body>
	<form method="GET" action="BrowseLoanServlet">
		<p>
			LoanType : 
			 <select name="loantype">
				<option value="homeloan">HomeLoan</option>
				<option value="carloan">CarLoan</option>
			</select>
		</p>
		<p>
			LoanAmount : <input type="text" name="loanamount" maxlength="20" pattern="[0-9]{4,10}">
		</p>

		<p>
			Place : <select name=place>
				<option value="hyd">Hyderbad</option>
			</select>
		</p>

		<p>
			Tenure : <input type="number" name="tenure" value="00" min="12"
				max="600">
		</p>
		<p>
			Occupation : <input type="radio" name="job" value="self">Self
			<input type="radio" name="job" value="salary"> Salary
		</p>
		<p>
			<input type="submit" value="browse">
		</p>
	</form>

</body>
</html>