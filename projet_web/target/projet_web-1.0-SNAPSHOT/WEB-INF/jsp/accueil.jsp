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
        <div class="row">
            <div class="col-sm-4">
                <h3>Column 1</h3>
                <p>Lorem ipsum dolor..</p>
                <p>Ut enim ad..</p>
            </div>
            <div class="col-sm-4">
                <h3>Column 2</h3>
                <p>Lorem ipsum dolor..</p>
                <p>Ut enim ad..</p>
            </div>
            <div class="col-sm-4">
                <h3>Column 3</h3>
                <p>Lorem ipsum dolor..</p>
                <p>Ut enim ad..</p>
            </div>
        </div>
    </div>
    <section class="container">
    <div class="row">
        <!-- c:forEach items="${listeAuteur}" var="auteur">-->
        <div class="col-sm-6 col-md-3">
            <div class="thumbnail">
                <div class="caption">
                    <h3>${auteur.firstname}</h3>
                    <p>${auteur.shortBio}</p>
                </div>
            </div>
        </div>
        <!-- /c:forEach> -->
    </div>
    </section>
</body>
</html>