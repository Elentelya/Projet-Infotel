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

<<<<<<< HEAD
	<%@include file="navigation.jsp"%>
	<h1>Qui sommes nous ?</h1>
	<p>Lancé à l'occasion des Rencontres nationales de la librairie en
		juin 2017, le site locaLivre.com est le premier moteur de recherche
		des librairies indépendantes. Il fédère 16 portails (groupement ou
		associations de libraires indépendants) et rassemble les stocks de 700
		librairies. Depuis son lancement, la page d'accueil du site a été
		repensée et optimisée. Cette nouvelle approche s'inscrit plus
		fortement dans notre identité collective, redonne de l'importance au
		moteur de recherche et guide l'internaute vers la réservation ou la
		commande. Nous vous encourageons à rejoindre un portail de libraires
		pour intégrer ce moteur de recherche qui a pour objectif d'augmenter
		de manière significative vos commandes en ligne.
	<hr />
	<h1>La charte de nos librairies</h1>
	<p>Devant le succès rencontré par la diffusion de la charte des
		libraires sous forme d'affiche l'an dernier, puis de carte postale aux
		RNL, nous vous proposons cette année de l'installer en rotation sur
		l'ensemble de vos outils digitaux. Chaque message de la charte est
		déployé sur un visuel et invite l'internaute à la consulter dans son
		intégralité sur le site localivre.com</p>
=======
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
>>>>>>> branch 'master' of https://github.com/Elentelya/Projet-Infotel
</body>
</html>