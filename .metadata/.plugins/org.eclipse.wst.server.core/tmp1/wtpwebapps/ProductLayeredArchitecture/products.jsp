<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.ArrayList, com.pace.bean.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Product details have been entered successfully!</h1>
	<hr>

	<%
	ArrayList<Product> productList = (ArrayList<Product>) request.getAttribute("productList");
	%>

	<%
	for (Product product : productList) {
	%>

	<h2 align="center">

		Product Id :<%=product.getId()%></h2>

	<h2 align="center">
		Product Name :

		<%=product.getName()%></h2>

	<h2 align="center">

		Product Price :

		<%=product.getPrice()%></h2>
	<br>
	<br>

	<%
	}
	%>

	<h2 align="center">Thank you for visiting!</h2>
</body>
</html>