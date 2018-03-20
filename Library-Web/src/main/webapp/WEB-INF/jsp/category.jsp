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
	<div class="col-md-4 col-offset-4 centered">
        <h3 style="background-color: lavender;">${category}</h3>
    </div>	
	<hr /><br/>
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
</body>
</html>