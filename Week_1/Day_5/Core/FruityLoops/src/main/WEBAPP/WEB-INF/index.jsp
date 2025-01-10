<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Fruity Loops</title>
</head>
<body style="margin-top:30px">
<div class="container">
<h1 style="color:#FFB6C1">Fruity Store</h1>
</div>
<div class="container d-flex flex-column" style="margin-top:30px; border: 30px solid #FFB6C1">

	<table class="table table-hover">
	  <thead>
	    <tr>
	      <th scope="col">Name</th>
	      <th scope="col">Price</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="fruit" items="${fruits}">
	    <tr>
	      <td><c:out value="${fruit.name}"></c:out></td>
	      <td><c:out value="${fruit.price}"></c:out></td>
	    </tr>
	 </c:forEach>
	  </tbody>
	</table>
</div>
</body>
</html>