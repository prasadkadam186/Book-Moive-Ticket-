<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body>
	<%
		String name=(String)request.getAttribute("moive");
		Double Amount=(Double)request.getAttribute("bill");
	%>
	<center>
	<h1 style="color: #ff0080"> Moive Name : <%=name %></h1>
	<h1 style="color: #ff0080"> Total Amount : <%=Amount %></h1>
	<img alt="" src="images/lobo.png">
	<h3>Enjoy the Moive  and Visit Again !!!!!</h3>
	</center>
</body>
</html>