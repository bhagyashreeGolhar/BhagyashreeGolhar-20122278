<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Emi.jsp">
	<div style="text-align: center;">
	<span><h1 style="background-color: brown">EMI Loan Calculator</h1><span>
	Loan Amount $: <input type="text" name="amount"></br>
	Loan Tenure: <input type="text" name="tenure"></br>
	<select>
		<option>Months</option>
		<option>Year</option>
		<option>Days</option>
	</select>  </br>
	
	Interest Rate % <input type="text" name="rate"> </br></br></br>
	<input type="submit" value="Clear">
	<input type="submit" value="Calculate">
	</div>
	</form>
	
	
	

</body>
</html>