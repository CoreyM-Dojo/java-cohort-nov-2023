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

		<h1>Create A Pizza</h1>
		<c:out value="${noPizza}"></c:out>
		<form:form class="border border-dark p-3 bg-secondary text-light" action="/pizzas" method="POST" modelAttribute="pizza">
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
			

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>

		<table class="table table-striped table-dark mt-3">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Pizza Type</th>
					<th scope="col">Pizza Size</th>
					<th scope="col">Toppings</th>
					<th scope="col">Actions</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pizza" items="${allPizzas}">
					<tr>
						<td><a href="/pizzas/${pizza.id}"> <c:out
									value="${pizza.id}"></c:out>
						</a></td>
						<td><c:out value="${pizza.pizzaType}"></c:out></td>
						<td><c:out value="${pizza.pizzaSize}"></c:out></td>
						<td><c:out value="${pizza.numOfToppings}"></c:out></td>
						<td>
							<a href="/pizzas/edit/${pizza.id}">Edit</a>
							<form action="/pizzas/${pizza.id}" method="post">
								<input type="hidden" name="_method" value="delete"/>
								<button>Delete</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
</body>
</html>