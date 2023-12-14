<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="card" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">
    	<c:out value="${pizza.pizzaType }"></c:out>
    </h5>
    <p class="card-text">Size: <c:out value="${pizza.pizzaSize }"></c:out></p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
  <div class="container">
  	<form action="/pizzas/add" method="POST">
  		<input type="hidden" name="pizzaId" value="${pizza.id}"/>
  		<select name="toppingId">
  			<c:forEach var="oneTopping" items="${allToppings }">
  				<option value="${oneTopping.id}">${oneTopping.toppingName}</option>
  			</c:forEach>
  		</select>
  		<button class="btn btn-success">Add</button>
  	</form>
  	
  </div>
</div>
  	<div class="container">
  		<h2>Included Toppings</h2>
  		<c:forEach var="toppingOnPizza" items="${pizza.toppings }">
  			<p>
  				<c:out value="${toppingOnPizza.toppingName}"></c:out>
  				<a href="/pizzas/remove/${pizza.id }/${toppingOnPizza.id}" class="btn btn-sm btn-dark text-danger">X</a>
  			</p>
  		</c:forEach>
  	</div>
</body>
</html>