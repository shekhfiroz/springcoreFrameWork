<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sucess Page</title>
</head>
<body>
	<input type="text" value="<%=request.getAttribute("interest_rate")%>" >
	<input type="text" value=" <%=request.getAttribute("interest_amount")%>" >
	<input type="text" value="<%=request.getAttribute("repayment_amount")%>" >
	<input type="text" value="<%=request.getAttribute("emi")%>" >
</body>
</html>
<!-- 
    getParameter() returns http request parameters. Those passed from the client to the server. For example http://example.com/servlet?parameter=1. Can only return String

    getAttribute() is for server-side usage only - you fill the request with attributes that you can use within the same request. For example - you set an attribute in a servlet, and read it from a JSP. Can be used for any object, not just string.
 -->