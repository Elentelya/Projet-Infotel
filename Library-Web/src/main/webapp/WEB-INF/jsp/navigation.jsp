<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>navigation</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark"> <!-- Brand -->
	<a class="navbar-brand">LocaLivres</a> <!-- Links -->
	<ul class="navbar-nav">
		<li class="nav-item">
			<a class="nav-link" href="accueil">Accueil</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="books">Catalogue complet</a>
		</li>

		<!-- Dropdown -->
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="category" id="navbardrop" data-toggle="dropdown">Categories</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="sciencefiction">Science Fiction</a>
				<a class="dropdown-item" href="fantasy">Fantasy</a>
				<a class="dropdown-item" href="thriller">Thriller</a>
			</div>
		</li>
		
		<c:if test="${(sessionScope.isAdmin == false)}">
			<li class="nav-item">
				<a class="nav-link" href="administration">
					<span class="glyphicon glyphicon-shopping-cart"></span>Panier
				</a>
			</li>
		</c:if>

		<c:if test="${(sessionScope.isAdmin == true) && (sessionScope.userExist == true)}">
			<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="administration" id="navbardrop" data-toggle="dropdown"><span class="glyphicon glyphicon-wrench"></span>Administration</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="addBook"><span class="glyphicon glyphicon-book"></span> Ajouter un livre</a>
				<a class="dropdown-item" href="listBook"><span class="glyphicon glyphicon-book"></span> Editer un livre</a>
				<a class="dropdown-item" href="addMember"><span class="glyphicon glyphicon-user"></span> Ajouter un membre</a>
				<a class="dropdown-item" href="listMember"><span class="glyphicon glyphicon-list-alt"></span> Editer un membre</a>
			</div>
		</li>
		</c:if>
		
		<c:if test="${sessionScope.userExist == true}">
			<li class="nav-item">
				<a class="nav-link" href="logout">
					<span class="glyphicon glyphicon-log-out"></span>Deconnexion
				</a>
			</li>			
		</c:if>
		
		<c:if test="${sessionScope.userExist != true}">
			<li>
				<a class="nav-link" href="login"><span class="glyphicon glyphicon-log-in"></span>
					Login
				</a>
			</li>
		</c:if>
	</ul>
	</nav>
	<br>
</body>
</html>