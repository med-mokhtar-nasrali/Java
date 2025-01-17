<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css">
			<title>Ninja Gold Game</title>
		</head>

		<body class="bg-light">
			<div class="container py-5">
				<div class="card shadow-lg border-0 mb-5">
					<div class="card-body p-4">
						<div class="d-flex justify-content-between align-items-center">
							<div class="d-flex align-items-center">
								<i class="bi bi-coin text-warning fs-1 me-3"></i>
								<h1 class="mb-0">Your Gold: <span class="badge bg-warning text-dark fs-4">${gold}</span>
								</h1>
							</div>
							<form action="/form" method="POST">
								<input type="hidden" name='name' value="reset">
								<button class="btn btn-danger btn-lg"><i class="bi bi-arrow-counterclockwise"></i>
									Reset</button>
							</form>
						</div>
					</div>
				</div>

				<div class="row g-4 mb-5">
					<c:set var="locations" value="${[
						{'name': 'farm', 'icon': 'house-fill', 'color': 'primary', 'range': '10-20'},
						{'name': 'cave', 'icon': 'mountain', 'color': 'success', 'range': '5-10'},
						{'name': 'house', 'icon': 'house-door-fill', 'color': 'info', 'range': '2-5'},
						{'name': 'quest', 'icon': 'trophy-fill', 'color': 'warning', 'range': '0-50'},
						{'name': 'spa', 'icon': 'water', 'color': 'info', 'range': '5-20'}
					]}" />

					<c:forEach var="loc" items="${locations}">
						<div class="col">
							<div class="card h-100 shadow-sm border-0">
								<div class="card-body text-center">
									<i class="bi bi-${loc.icon} text-${loc.color} fs-1 mb-3"></i>
									<h2 class="card-title text-capitalize">${loc.name}</h2>
									<p class="text-muted">
										(${loc.name eq 'spa' ? 'loose' : 'earns'} ${loc.range} gold)
									</p>
									<form action="/form" method="POST">
										<input type="hidden" name="name" value="${loc.name}">
										<button
											class="btn btn-${loc.color} w-100 ${loc.color eq 'info' ? 'text-white' : ''}">
											<i class="bi bi-gem"></i>
											${loc.name eq 'spa' ? 'Go to Spa' : 'Find Gold!'}
										</button>
									</form>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>

				<div class="card shadow-lg border-0">
					<div class="card-body">
						<h3 class="card-title mb-4"><i class="bi bi-journal-text"></i> Activities:</h3>
						<div class="bg-light p-4 rounded" style="max-height: 300px; overflow-y: auto;">
							<c:forEach var="msgn" items="${earns}">
								<p class="text-success mb-2"><i class="bi bi-arrow-up-circle-fill"></i> ${msgn}</p>
							</c:forEach>

							<c:forEach var="msgF" items="${lose}">
								<p class="text-danger mb-2"><i class="bi bi-arrow-down-circle-fill"></i> ${msgF}</p>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>

			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
		</body>

		</html>