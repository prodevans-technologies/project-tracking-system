<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>KANBAN</title>
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
					<li class="active"><a href='<c:url value="/kanban"></c:url>'>Kanban
							Board</a></li>
					<li><a href='<c:url value="/employee"></c:url>'>Employee</a>
					</li>

					<li><a href='<c:url value="/create-project"></c:url>'>Create
							Project</a></li>

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
	</div>
	<!--/. Navigation bar end -->

	<!-- Main container -->
	<div class="container">
		<div class="col-md-4">
			<div class="panel panel-default ">
				<div class="panel-heading">Project 1</div>
				<div class="panel-body">
					<div class="progress">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="40" aria-valuemin="0" aria-valuemax="40"
							style="width: 40%">40% Complete (To Do)</div>

					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%">50% Complete (Working)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-warning" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 60%">60% Complete (Done)</div>
					</div>
					<a href="" class="btn btn-warning">Done</a>
                </div>
			
			</div>

		</div>
      <div class="col-md-4">
			<div class="panel panel-default ">
				<div class="panel-heading">Project 2</div>
				<div class="panel-body">
					<div class="progress">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="40" aria-valuemin="0" aria-valuemax="40"
							style="width: 40%">40% Complete (To Do)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%">50% Complete (Working)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-warning" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 60%">60% Complete (Done)</div>
					</div>
        <a href="" class="btn btn-warning">Done</a>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="panel panel-default ">
				<div class="panel-heading">Project 3</div>
				<div class="panel-body">
					<div class="progress">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="40" aria-valuemin="0" aria-valuemax="40"
							style="width: 40%">40% Complete (To Do)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%">50% Complete (Working)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-warning" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 60%">60% Complete (Done)</div>
					</div>
					<a href="" class="btn btn-warning">Done</a>


				</div>
			</div>

		</div>

		<div class="col-md-4">
			<div class="panel panel-default ">
				<div class="panel-heading">Project 4</div>
				<div class="panel-body">
					<div class="progress">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="40" aria-valuemin="0" aria-valuemax="40"
							style="width: 40%">40% Complete (To Do)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%">50% Complete (Working)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-warning" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 60%">60% Complete (Done)</div>
					</div>
					<a href="" class="btn btn-warning">Done</a>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="panel panel-default ">
				<div class="panel-heading">Project 5</div>
				<div class="panel-body">
					<div class="progress">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="40" aria-valuemin="0" aria-valuemax="40"
							style="width: 40%">40% Complete (To Do)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%">50% Complete (Working)</div>
					</div>
					<div class="progress">
						<div class="progress-bar progress-bar-warning" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 60%">60% Complete (Done)</div>
					</div>
					<a href="" class="btn btn-warning">Done</a>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="panel panel-default ">
				<div class="panel-heading">Project 6</div>
				<div class="panel-body">
					<div class="progress">
						<div class="progress-bar progress-bar-success" role="progressbar"
							aria-valuenow="40" aria-valuemin="0" aria-valuemax="40"
							style="width: 40%">40% Complete (To Do)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-info" role="progressbar"
							aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
							style="width: 50%">50% Complete (Working)</div>
					</div>

					<div class="progress">
						<div class="progress-bar progress-bar-warning" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 60%">60% Complete (Done)</div>
					</div>
					<a href="" class="btn btn-warning">Done</a>
				</div>
			</div>
		</div>
	</div>
	<!--/. Main container ends -->
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