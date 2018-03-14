<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page d'accueil</title>
</head>
<body>

	<%@include file="navigation.jsp"%>
	<h1>Page d'administration</h1>
	<hr>
	<br />
	<div class="row">
		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th>Pseudo</th>
						<th>Email</th>
						<th>Phone</th>
						<th>idAdmin</th>
					</tr>
				</thead>
				<c:forEach items="${listeMembres}" var="membre">
					<tbody>
						<tr>
							<td>${membre.firstname}</td>
							<td>${membre.email}</td>
							<td>${membre.phone}</td>
							<td>${membre.admin}</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>