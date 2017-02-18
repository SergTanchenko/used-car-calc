<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
		<title>Starter Template - Materialize</title>

		<!-- CSS  -->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection"/>
		<link href="css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
	</head>
	<body>
		<nav class="light-blue lighten-1" role="navigation">
			<div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo">Logo</a></div>
		</nav>
		<div class="section no-pad-bot" id="index-banner">
			<div class="container">
				<h3 class="header center orange-text">Визначення середньоринкової вартості авто</h3>
			</div>
		</div>


		<div class="container">
			<div class="row">
				<form id ="carForm" class="col s12" action="/calculatePrice.do">
					<div class="row">
						<div class="input-field col s6">
							<input id="newCarPrice" type="text" class="validate">
							<label for="newCarPrice">Ціна нового авто в Україні</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s6">
							<input id="operatingPeriod" type="text" class="validate">
							<label for="operatingPeriod">Період експлуатації</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s6">
							<input id="mileage" type="text" class="validate">
							<label for="mileage">Пробіг</label>
						</div>
					</div>
					<div class="row">
						<a class="waves-effect waves-light btn" href="javascript:{}"
						   onclick="document.getElementById('carForm').submit();">Розрахувати вартість</a>
					</div>
				</form>
			</div>
		</div>

		<footer class="page-footer orange">
			<div class="container">
				<div class="row">
					<div class="col l6 s12">
						<h5 class="white-text">About</h5>
						<p class="grey-text text-lighten-4">Some text</p>
					</div>
				</div>
			</div>
			<div class="footer-copyright">
				<div class="container">
					Made by <span class="orange-text text-lighten-3">stanch</span>
					Design <a class="orange-text text-lighten-3" href="http://materializecss.com">Materialize</a>
				</div>
			</div>
		</footer>


		<!--  Scripts-->
		<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script src="js/materialize.min.js"></script>
	</body>
</html>
