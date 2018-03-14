<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meilleures ventes</title>
</head>
<body>
	<%@include file="navigation.jsp"%>
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
</body>
</html>