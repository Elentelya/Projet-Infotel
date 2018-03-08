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
    <nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand">LocaLivre</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="accueil">Accueil</a></li>
            <li><a href="books">Livres</a></li>
            <li><a href="#2">Page 2</a></li>
            <li><a href="#3">Page 3</a></li>
            <li><a href="#4">Page 4</a></li>
        </ul>
        <c:if test="${empty firstname}">
            var1 is empty or null.
        </c:if>
        <c:if test="${not empty firstname}">
            var1 is NOT empty or null.
        </c:if>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="login"><span class="glyphicon glyphicon-user"></span>
                    Connexion</a></li>
        </ul>
    </div>
    </nav>
</body>
</html>