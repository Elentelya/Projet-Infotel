<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section>
	<div class="jumbotron">
		<div class="container">
			<h1>Livres</h1>
			<p>Liste de nos livres</p>
		</div>
	</div>
	</section>
	<section class="container">
	<div class="row">
		<c:forEach items="${listeLivres}" var="livre">
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<div class="caption">
						<h3>${livre.title}</h3>
						<%-- <p>${customer.address}</p> --%>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	</section>
</body>
</html>