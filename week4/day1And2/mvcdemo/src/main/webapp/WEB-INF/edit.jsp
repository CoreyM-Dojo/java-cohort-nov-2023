<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
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
	<div class="container p-3">
		<h1>Update Pizza</h1>
		<form:form class="border border-dark p-3 bg-secondary text-light"
			action="/pizzas/${pizza.id}" method="post" modelAttribute="pizza">
			<form:hidden path="id"/>
			<!-- This hidden input is needed to create a put request -->
			<input type="hidden" name="_method" value="put"/>
			<div class="mb-3">
				<form:label path="pizzaType" class="form-label">Pizza Type</form:label>
				<form:input path="pizzaType" class="form-control" />
				<form:errors path="pizzaType" />
			</div>
			<div class="mb-3">
				<form:label path="pizzaSize" class="form-label">Pizza Size</form:label>
				<form:select path="pizzaSize" items="${pizzaSizes}"></form:select>
				<form:errors path="pizzaSize" />
			</div>

			<div class="mb-3 d-flex flex-column">
				<form:label path="toppings" class="form-label">Toppings</form:label>
				<form:checkboxes path="toppings" items="${toppingsChoices}"></form:checkboxes>

			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>

</body>
</html>