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
<script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<script src="https://cdn.tailwindcss.com"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container-fluid">
		<ul class="flex">
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>
			<li>Test Fruit</li>			
		</ul>
		<h1>Hello World</h1>

		<a class="btn btn-dark" data-bs-toggle="collapse" href="#target">Click
			to reveal a secret</a>
		<p class="collapse" id="target">Lorem ipsum dolor sit amet,
			consectetur adipisicing elit. Deleniti natus vitae dolore distinctio
			voluptatibus laborum quis enim nihil nemo saepe aut quam amet
			quibusdam labore ullam laboriosam doloremque. Distinctio impedit.</p>

		<table class="table bg-rose-700 text-light">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">First</th>
					<th scope="col">Last</th>
					<th scope="col">Handle</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>@mdo</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>@fat</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td colspan="2">Larry the Bird</td>
					<td>@twitter</td>
				</tr>
			</tbody>
		</table>

		<div id="carouselExampleControls" class="carousel slide w-75"
			data-bs-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="images/burning-town.png" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="images/castle-gates.png" class="d-block w-100" alt="...">
				</div>
				<div class="carousel-item">
					<img src="images/start.png" class="d-block w-100" alt="...">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleControls" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleControls" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>
</body>
</html>