<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
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
		<div class="panel panel-info">
			<div class="panel-heading">Screen project</div>
			<div class="panel-body">
				<c:url value="/project/create-project" var="project_create_link"></c:url>
				<form:form class="form-horizontal" action="${project_create_link }" method="POST" modelAttribute="project_object">
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Project Id:</label>
						<div class="col-sm-10">
							<form:input path="pro_id" type="text" class="form-control" id="id1"
								placeholder="Enter id" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">Project
							Name:</label>
						<div class="col-sm-10">
							<form:input path="pro_name" type="text" class="form-control" id="id2"
								placeholder="Enter pro name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Project
							Description:</label>
						<div class="col-sm-10">
							<form:input path="pro_description" type="text" class="form-control" id="id3"
								placeholder="Enter des" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">Project
							Type:</label>
						<div class="col-sm-10">
							<form:select path="pro_type" class="form-control" id="sel1">
								<form:option value=""></form:option>
								<form:option value="Agile">Agile</form:option>
								<form:option value="Scrum">Scrum</form:option>
							</form:select>
						</div>
					</div>
					<div class="checkbox">
						<div class="col-ms-2">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
					</div>
				</form:form>
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