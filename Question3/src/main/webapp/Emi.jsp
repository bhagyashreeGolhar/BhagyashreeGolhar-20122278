<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		float amount=Float.parseFloat(request.getParameter("amount"));
		int tenure=Integer.parseInt(request.getParameter("tenure"));
		float rate=Float.parseFloat(request.getParameter("rate"));
		
		Float totalAmount = amount + (amount * rate * tenure) / 100;
		Float emi = totalAmount / tenure;

	
	%>
	
	
	Total Amount: <%= totalAmount %>
	EMI per Month: <%= emi %>
	

</body>
</html>