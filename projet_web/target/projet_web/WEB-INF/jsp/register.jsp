<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

<!-- Website CSS style -->
<link rel="stylesheet" type="text/css" href="assets/css/main.css">

<!-- Website Font style -->
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
    rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
    rel='stylesheet' type='text/css'>

<title>Inscription</title>
</head>
<body>
    <%@include file="navigation.jsp"%>
    <div class="container">
        <div class="row main">
            <div class="panel-heading">
                <div class="panel-title text-center">
                    <h1 class="title">Inscription</h1>
                    <hr />
                </div>
            </div>
            <div class="main-login main-center">
                <form class="form-horizontal" method="post" action="register">

                    <div class="form-group">
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user fa"
                                    aria-hidden="true"></i></span> <input type="text" class="form-control"
                                    name="firstname" id="firstname"
                                    placeholder="Enter your FirstName (or surname)" required/> <input type="text"
                                    class="form-control" name="lastname" id="lastname"
                                    placeholder="Enter your LastName" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i
                                    class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
                                    type="text" class="form-control" name="email" id="email"
                                    placeholder="Enter your Email"  required />
                            </div>
                        </div>
                    </div>
<div class="form-group">
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-phone fa"
                                    aria-hidden="true"></i></span> <input type="text" class="form-control"
                                    name="phone" id="phone" placeholder="Enter your PhoneNumber" />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i
                                    class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
                                    type="password" class="form-control" name="password"
                                    id="password" placeholder="Enter your Password" required />
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="cols-sm-10">
                            <div class="input-group">
                                <span class="input-group-addon"><i
                                    class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
                                    type="password" class="form-control" name="confirm"
                                    id="confirm" placeholder="Confirm your Password" required />
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group ">
                        <button class="btn btn-lg btn-primary btn-block" type="submit">Inscription</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>