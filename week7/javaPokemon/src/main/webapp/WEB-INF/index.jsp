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
    <title>Home Page</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
  <table class="table table-dark">
  	<thead>
  		<tr>
  			<th>Name</th>
  			<th>Search</th>
  		</tr>
  	</thead>
  	<tbody>
  		<c:forEach var="pokemon" items="${pokemonList.results }">
  			<tr>
  				<td>
  					<c:out value="${pokemon.name }"></c:out>
  				</td>
  				<td>
  					<form action="/pokemon/get">
  						<input type="hidden" name="url" value="${pokemon.url}" />
  						<button class="btn btn-success">Search</button>
  					</form>
  				</td>
  			</tr>
  		</c:forEach>
  	</tbody>
  </table>
</body>
</html>