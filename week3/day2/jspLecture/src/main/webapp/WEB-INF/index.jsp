<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	
		<h1>Hello World</h1>
		<c:set value="nellie" var="myDogName" />
		<c:out value="${myDogName}"/>
		<c:set var="loggedIn" value="${true}"/>
		<c:set var="num" value="${16}" />
		
		<c:if test="${loggedIn == true }">	
			<c:forEach var="item" items="${myList}">
			<p>	
				<c:out value="${item}"></c:out>
			</p>
			</c:forEach>
		</c:if>
		
		<h2>Club entry</h2>
		<p>You must be at least 18 to enter</p>
		<c:choose>
			<c:when test="${num >= 18 }">
				<p>You are free to enter the club</p>
			</c:when>
			<c:otherwise>
				<p>Sorry kiddo, maybe next year</p>		
			</c:otherwise>
		</c:choose>
	</div>
	
</body>
</html>