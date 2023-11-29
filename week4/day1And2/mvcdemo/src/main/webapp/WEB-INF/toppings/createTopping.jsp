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
   <div class="container">
   	<form:form action="/toppings" method="post" modelAttribute="topping">
   		<form:select path="pizza">
   			<form:options items="${allPizzas}" itemValue="id" itemLabel="pizzaType"/>
   		</form:select>
   		<div class="form-group">
   			<form:label path="toppingName">Topping Name</form:label>
   			<form:input path="toppingName"/>
   		</div>
   		<div class="form-group">
   			<form:label path="toppingAmount">Topping Amount</form:label>
   			<form:input path="toppingAmount"/>
   		</div>
   		<div class="form-group">
   			<form:label path="pricePerOunce">Price per ounce</form:label>
   			<form:input path="pricePerOunce"/>
   		</div>
   		<button class="btn btn-dark">Create</button>
   	</form:form>
   </div>
</body>
</html>