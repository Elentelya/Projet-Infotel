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
	<div class="jumbotron text-center">
		<h1>LocaLivre</h1>
		<p>Application de gestion de livres d'une bibliothèque</p>
	</div>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand">LocaLivre</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="accueil">Accueil</a></li>
			<li><a href="books">Catalogue complet</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown">Catégories </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Science Fiction</a>
					<a class="dropdown-item" href="#">Fantasy</a>
					<a class="dropdown-item" href="#">Jeunesse</a>
					<a class="dropdown-item" href="#">Thriller</a>	
				</div>
			</li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="login"><span class="glyphicon glyphicon-user"></span>
					Connexion</a></li>
		</ul>
	</div>
	</nav>
</body>
</html>