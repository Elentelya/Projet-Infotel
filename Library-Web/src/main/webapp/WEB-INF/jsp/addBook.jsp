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

<title>Add book</title>
</head>
<body>
	<%@include file="navigation.jsp"%>
	<div class="container">
		<div class="row main">
			<div class="panel-heading">
				<div class="panel-title text-center">
					<h1 class="title">Ajouter un livre</h1>
					<hr />
				</div>
			</div>
			<div class="main-login main-center">
				<form class="form-horizontal" method="post" action="addBook">

					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user fa"
									aria-hidden="true"></i></span> <input type="text" class="form-control"
									name="title" id="title" placeholder="Titre" required />
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
									type="text" class="form-control" name="description"
									id="description" placeholder="Description" required />
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-phone fa"
									aria-hidden="true"></i></span> <input type="text" class="form-control"
									name="price" id="price" placeholder="Prix" />
							</div>
						</div>
					</div>

					Date
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-phone fa"
									aria-hidden="true"></i></span> <input type="text" class="form-control"
									name="publicationDate" id="publicationDate"
									placeholder="Date de publication" />
							</div>
						</div>
					</div>

					Fichier
					<div class="form-group">
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
									type="password" class="form-control" name="imageName"
									id="imageName" placeholder="Image ..." required />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="sel1">Est il populaire ?</label>
						<select class="form-control" id="popular">
							<option>Oui</option>
							<option>Non</option>
						</select>
					</div>

					foreach category ?
					<div class="form-group">
						<label for="sel1">Categorie</label>
						<select class="form-control" id="popular">
							<option>Category1</option>
							<option>Category2</option>
							<option>Category3</option>
						</select>
					</div>

					Editor bookEditor
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

					List
					<Author> bookAuthors
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