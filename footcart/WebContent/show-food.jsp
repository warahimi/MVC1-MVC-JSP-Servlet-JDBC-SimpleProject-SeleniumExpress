<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menue</title>
</head>
<body>
	<h1 align="center">Menue</h1>
	<table border="1" cellpadding="30%" align="center" bgcolor="#9bf2b2" bordercolor="#121cdb">
			<tr>
				<th>Code</th>
				<th>Food Item</th>
				<th>Price</th>
			</tr>
			<c:forEach var="items" items="${foodItems}">
			<tr>
				<td><c:out value="${items.id}"></c:out></td>
				<td><c:out value="${items.item}"></c:out></td>
				<td><c:out value="${items.price}"></c:out></td>
			</tr>
			</c:forEach>
	
	</table>
</body>
</html>