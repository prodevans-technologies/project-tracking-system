<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<style type="text/css">
.panel.panel-primary {
	position: absolute;
	top: 40;
	right: 600;
	left: 600;
	bottom: 40;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Management</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap css -->
<c:url value="/bootstrap/css/bootstrap.min.css" var="bootstrap_css"></c:url>
<link rel="stylesheet" href="${bootstrap_css}">

<!-- Optional theme -->
<c:url value="/bootstrap/css/bootstrap-theme.min.css"
	var="bootstrap_theme_css" />
<link rel="stylesheet" href="${bootstrap_theme_css}">

<!-- Custom style sheet -->
<c:url value="/resources/style.css" var="custom_css" />
<link rel="stylesheet" href="${custom_css}">

<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap css -->
<c:url value="/bootstrap/css/bootstrap.min.css" var="bootstrap_css"></c:url>
<link rel="stylesheet" href="${bootstrap_css}">

<!-- Optional theme -->
<c:url value="/bootstrap/css/bootstrap-theme.min.css"
	var="bootstrap_theme_css" />
<link rel="stylesheet" href="${bootstrap_theme_css}">

<!-- Custom style sheet -->
<c:url value="/resources/style.css" var="custom_css" />
<link rel="stylesheet" href="${custom_css}">

</head>
<body>
	<!-- Static navbar -->
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Project Tracking System</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href='<c:url value="/kanban"></c:url>'>Kanban Board</a></li>
					<li class="dropdown" style="margin-left: 10px">
						<button href="#" class="btn btn-success navbar-btn" type="button"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">
							Hi... Admin <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href='<c:url value="/profile" />'>Profile</a></li>
							<li><a href="#">Change Password</a></li>
						</ul>
					</li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</nav>

	<!--/. Navigation bar end -->

	<!-- Main container -->
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">To Do</div>
			<div class="panel-body">Open Stack</div>
			<div class="input-append date" id="datetimepicker"
				data-date="12th jun" data-date-format="dd-mm">
				<input class="span2" size="16" type="text" value="12th jun">
				<span class="add-on"><i class="icon-th"></i></span>
			</div>

			<div class="panel panel-primary">
				<div class="panel-heading">In Progress</div>
				<div class="panel-body">Open Stack</div>
				<div class="input-append date" id="datetimepicker"
					data-date="14th jun" data-date-format="dd-mm">
					<input class="span2" size="16" type="text" value="14th jun">
					<span class="add-on"><i class="icon-th"></i></span>
				</div>
				<div class="panel panel-primary">
					<div class="panel-heading">Done</div>
					<div class="panel-body">Open Stack</div>
					<div class="input-append date" id="datetimepicker"
						data-date="20th jun" data-date-format="dd-mm">
						<input class="span2" size="16" type="text" value="20th jun">
						<span class="add-on"><i class="icon-th"></i></span>
					</div>
				</div>
			</div>

			<!-- Footer -->
			<footer class="navbar-inverse navbar-fixed-bottom">
				<div class="container-fluid">
					<div class="company_name">All &copy; reserved by Prodevans
						Technologies LLP</div>
					<div></div>

				</div>
			</footer>

			<!-- Scripts Section -->
			<c:url value="/bootstrap/js/jquery-3.3.1.min.js" var="jquery_js"></c:url>
			<script type="text/javascript" src="${jquery_js }"></script>
			<c:url value="/bootstrap/js/bootstrap.min.js" var="bootstrap_js"></c:url>
			<script type="text/javascript" src="${bootstrap_js }"></script>
</body>
</html>