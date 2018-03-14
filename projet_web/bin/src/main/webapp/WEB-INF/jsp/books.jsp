<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalogue complet</title>
</head>
<body>
	<%@include file="navigation.jsp"%>

	<div class="container">
		<div class="row">
			<div class="span12">
				<form class="form-horizontal" method="POST"
					action="${baseurl}recherche">
					<ul class="nav navbar-nav">
						<li><input class="form-control mr-sm-2" placeholder="Search by Title"
							id="motRecherche" name="motRecherche" /></li>
						<li><input type="submit" id="btnAdd"
							class="btn btn-default value=" Ok" /></li>
					</ul>
				</form>
			</div>
			<br/><hr/>
			<div class="span12">
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
	</div>
</body>
</html>