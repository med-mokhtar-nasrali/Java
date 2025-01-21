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
<div class="container mt-4">
        <div class="d-flex justify-content-around">
            <h2> <c:out value="${book.title }"></c:out></h2>
            <a class="btn btn-primary" href="/books">back to the shelves</a>
        </div>
         <hr>
    <div >
        <div >
    <h2><c:out value="${book.creator.getUserName()}"></c:out> read <c:out value="${book.title}"></c:out> by <c:out value="${book.authorName}"></c:out>  </h2>
        </div>
    </div>
     <hr>
    <div >
        <div >
            <h3>Here are <c:out value="${book.creator.getUserName()}"></c:out> Thoughts:</h3>
        </div>
        <hr>
        <p><c:out value="${book.thoughts}"></c:out></p>
    </div>
    <div>
    <a class="btn btn-secondary" href="/edit/${book.id}">Edit</a>
    <a class="btn btn-danger" href="/delete/${book.id}">Delete</a>
    </div>
</div>
</body>
</html>