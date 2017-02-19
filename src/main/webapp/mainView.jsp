<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
		<title>Starter Template - Materialize</title>

		<!-- CSS  -->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<link href="<c:url value="static/css/materialize.min.css" />" type="text/css" rel="stylesheet" media="screen,projection"/>
		<link href="<c:url value="static/css/style.css" />" type="text/css" rel="stylesheet" media="screen,projection"/>
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
				<%@ include file="carForm.jspf" %>
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
		<script src="<c:url value="static/js/materialize.min.js" />"></script>
		<script src="<c:url value="static/js/priceCalcForm.js" />"></script>
	</body>
</html>
