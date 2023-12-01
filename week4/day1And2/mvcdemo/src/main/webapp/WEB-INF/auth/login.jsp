<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tacos</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<c:out value="${notLoggedIn}"></c:out>
		<h1>Login</h1>
		<form:form class="border border-dark p-3 bg-secondary text-light" action="/auth/login" method="POST" modelAttribute="loginObj">
				<form:errors path="email" />
			<div class="mb-3">
				<form:label path="email" class="form-label">Email</form:label>
				<form:input type="email" path="email" class="form-control" />
			</div>
			<div class="mb-3">
				<form:label path="password" class="form-label">Password</form:label>
				<form:input type="password" path="password" class="form-control" />
			</div>
			
			<button type="submit" class="btn btn-primary">Login</button>
		</form:form>

	</div>
</body>
</html>
</body>
</html>