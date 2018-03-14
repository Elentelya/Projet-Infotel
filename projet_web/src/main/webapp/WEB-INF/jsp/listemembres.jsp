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

	<div class="col-md-4 col-offset-4 centered">
        <h3 style="background-color: lavender;">Catalogue complet</h3>
    </div>	
    <hr /><br/>
	<div class="container">
		<div class="row">			
			<div class="span12">
				<div class="row">
					<div class="container">
						<table class="table">
							<thead>
								<tr>
									<th>1</th>
									<th>2</th>
									<th>3</th>
								</tr>
							</thead>
							<!-- <c:forEach items="${listeLivres}" var="livre">
								<tbody>
									<tr>
										<td>${livre.title}</td>
										<td>${livre.price}</td>
										<td>${livre.description}</td>
									</tr>
								</tbody>
							</c:forEach> -->
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br/><hr/>
</body>
</html>