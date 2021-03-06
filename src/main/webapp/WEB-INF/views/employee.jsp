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

	<div class="container">
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-heading">Employee</div>
				<div class="panel-body">
						<!-- Code for identifying the operation -->
						<c:if test="${employee_mothod == 'update' }" >
							<c:url value="/employee/update-employee" var="create_emp" ></c:url>
						</c:if>
						<c:if test="${employee_mothod != 'update' }" >
							<c:url value="/employee/create-employee" var="create_emp" ></c:url>
						</c:if>
					
					<form:form action="${create_emp}" method="POST"
						modelAttribute="employee_object">
						<div class="form-group row">
							<label for="inputName3" class="col-sm-2 col-form-label">Emp_ID</label>
							<div class="col-sm-10">
								<form:input path="emp_id" type="text" class="form-control"
									id="inputName3" placeholder="Enter Your Employee_ID"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputName3" class="col-sm-2 col-form-label">Emp_Name</label>
							<div class="col-sm-10">
								<form:input path="emp_name" type="text" class="form-control"
									id="inputName3" placeholder="Enter Your Name"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputEmail3" class="col-sm-2 col-form-label">Emp_Email</label>
							<div class="col-sm-10">
								<form:input path="emp_email" type="email" class="form-control"
									id="inputEmail3" placeholder="Employee-Email"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPassword3" class="col-sm-2 col-form-label">Emp_Designation</label>
							<div class="col-sm-10">
								<form:input path="emp_designation" type="text"
									class="form-control" id="inputPassword3"
									placeholder="Enter your Designation"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputAddress3" class="col-sm-2 col-form-label">Emp_Address</label>
							<div class="col-sm-10">
								<form:input path="emp_address" type="text" class="form-control"
									id="inputAddress3" placeholder="Enter Your Address"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPhoneNumber3" class="col-sm-2 col-form-label">Emp_PhoneNumber</label>
							<div class="col-sm-10">
								<form:input path="emp_phno" type="text" class="form-control"
									id="inputPhoneNumber3" placeholder="Enter Your PhoneNumber"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputName3" class="col-sm-2 col-form-label">Join_Date</label>
							<div class="col-sm-10">
								<form:input path="join_date" type="text" class="form-control"
									id="inputName3" placeholder="Company Joined Date"></form:input>
							</div>
						</div>
						<div class="form-group row">
							<label for="inputName3" class="col-sm-2 col-form-label">Password</label>
							<div class="col-sm-10">
								<form:input path="password" type="password" class="form-control"
									id="inputName3" placeholder="******************"></form:input>
							</div>
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form:form>
				</div>
			</div>

			<c:if test="${ not empty message}">
				<div class="alert alert-danger">${message}</div>
			</c:if>
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