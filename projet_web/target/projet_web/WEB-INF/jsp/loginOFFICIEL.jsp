<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
</head>
<body>
	<%@include file="navigation.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="account-wall">
					<i class="fas fa-user"
						style="font-size: 48; text-align: center; padding: 10px 0; margin: 0 auto"></i>
					<form class="form-signin" method="post"
						action="loginProcess">
						<!-- action='<spring:url value="/signin"/>' -->
						<input type="text" class="form-control" placeholder="Email"
							name="email" id="email" required autofocus> <input
							type="password" class="form-control" placeholder="Password"
							name="password" id="password" required>
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							Sign in</button>
						<!-- <label class="checkbox pull-left"> <input type="checkbox"
                            value="remember-me"> Remember me
                        </label> <a href="#" class="pull-right need-help"></a><span 
                            class="clearfix"></span> -->
						<!-- anticipation sur 'Need help?' ou 'Mot de passe perdu'  -->
					</form>
				</div>
				<a href="register" class="text-center new-account">Create an
					account </a>
			</div>
			<c:if test="${not empty sessionScope.message}">
				<span style="color: green"><c:out
						value="${sessionScope.message}" /></span>
				<c:remove var="message" scope="session" />
			</c:if>
		</div>
	</div>
</body>
</html>

