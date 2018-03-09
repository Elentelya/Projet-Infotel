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
	<div class="container">
		<h1 style="background-color:lavender;">Livres recommandés</h1>
		<hr />
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
		<h1 style="background-color:lavender;">La charte de nos librairies</h1>
		<hr />
		<p class="text-justify">Devant le succès rencontré par la
			diffusion de la charte des libraires sous forme d'affiche l'an
			dernier, puis de carte postale aux RNL, nous vous proposons cette
			année de l'installer en rotation sur l'ensemble de vos outils
			digitaux. Chaque message de la charte est déployé sur un visuel et
			invite l'internaute à la consulter dans son intégralité sur notre
			site : localivre.com</p>
	</div>
</body>
</html>