<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <title>New Book</title>
</head>
<body class="container mt-5">
	<h1>Add a Book to your Shelf!</h1>
	<a href="/books">back to the shelves</a>
    <div class="container mt-4">
<form:form action="/book/new" method="POST" modelAttribute="book">

<div class="form-control">
<form:label path="title">Title:</form:label>
<form:input path="title"></form:input>
<form:errors path="title" class="badge text-danger"/>
</div>

<div class="form-control">
<form:label path="authorName">Author:</form:label>
<form:input path="authorName"></form:input>
<form:errors path="authorName" class="badge text-danger"/>
</div>


<div class="form-control">
<form:label path="thoughts">My thoughts:</form:label>
<form:textarea rows="3" path="thoughts"></form:textarea>
<form:errors path="thoughts" class="badge text-danger"/>
</div>
<button class="btn btn-success">Submit</button>
</form:form>

</div>
</body>
</html>
