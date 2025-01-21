<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
<div class="container">
<div class="d-flex justify-content-around">
	<div>
		<h1>Welcome, <c:out value="${connected.getUserName()}"></c:out> </h1>
		<p>Books from everyone's shelves:</p>
	</div>
	<div>
		<a href="/logout">Logout</a>
		<a href="/book/new">+ Add a book to my shelf!</a>
	</div>
</div>
	<table class="table table-striped">
<thead>
<tr>
<th>ID</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted By</th>

</tr>
</thead>
<tbody>
<c:forEach var="book" items="${books}" >
<tr>
<td>
 <h5><c:out value="${book.id}"></c:out></h5>
</td>
<td>
 <a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a>
</td>
<td>
 <h5><c:out value="${book.authorName}"></c:out></h5>
</td>
<td>
 <h5><c:out value="${book.creator.getUserName()}"></c:out></h5>
</td>
</tr>
</c:forEach>
</tbody>

</table></div>
</div>
</body>
</html>