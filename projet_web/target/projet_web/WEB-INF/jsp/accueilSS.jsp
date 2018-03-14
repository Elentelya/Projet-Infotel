<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>accueil</title>
</head>
<body>
	<%@include file="navigation.jsp"%>
	<div class="col-md-4 col-offset-4 centered">
		<h3 style="background-color: lavender;">Livres recommandés</h3>
	</div>
	<hr />
	<br />
	<div class="row">
		<div class="col-md-9">
			<div class="row">
				<div class="container">
					<table class="table">
						<thead>
							<tr>
								<th>Titre</th>
								<th>Prix</th>
								<th>Description</th>
							</tr>
						</thead>
						<c:forEach items="${listeLivres}" var="livre">
							<tbody>
								<tr>
									<td>${livre.title}</td>
									<td>${livre.price}</td>
									<td>${livre.description}</td>
								</tr>
							</tbody>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
	<hr />
	<hr />
	<!-- <h4>${message}</h4>
	<br>
	<a href='<spring:url value="/signout"/>'>Deconnexion</a> -->
</body>
</html>


