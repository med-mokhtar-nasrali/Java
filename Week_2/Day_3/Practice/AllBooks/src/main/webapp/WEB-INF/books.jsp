<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>All Books</title>
</head>
<body>
<div class="container">
<h1>All Books</h1>
	<div>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Title</th>
		      <th scope="col">Language</th>
		      <th scope="col">Pages</th>
		    </tr>
		  </thead>
		  <tbody>
			  <c:forEach var="book" items="${books}">
			    <tr>
			      <td><c:out value="${book.id}"></c:out></td>
			      <td><a href="/books/${book.id}"><c:out value="${book.title}"></a></c:out></td>
			      <td><c:out value="${book.language}"></c:out></td>
			      <td><c:out value="${book.numberOfPages}"></c:out></td>
			    </tr>
			   </c:forEach>
		  </tbody>
		</table>
	</div>
</div>
</body>
</html>