<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>VitaCenter</title>

	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/login.css">
</head>

	<div class="login-form col-xs-10 col-xs-offset-1 col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">

		<header>
			<h1><img class="img-responsive" src="resources/img/logo1.png"></h1>
			<h2 class="text-center">Entre com seu <b>usuário</b> e <b>senha</b></h2>
		</header>
		<form action="LoginServelet" method="post">
			<div class="form-group">
				<div class="input-group">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-user"></span>
					</div>
					<input type="text" name="login" class="form-control" placeholder="usuário">
				</div>
			</div>	

			<div class="form-group">
				<div class="input-group">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-option-horizontal"></span>
					</div>
					<input type="password" name="senha" class="form-control" placeholder="senha">
				</div>
			</div>	

			<footer>
				<div class="checkbox pull-left">
					<label><input type="checkbox" name="lembrar">Lembrar de mim</label>
				</div>
				<button type="submit" class="btn btn-primary pull-right">Entrar</button>
			</footer>
		</form>

	</div>


	<script src="js/jquery-3.4.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</html>