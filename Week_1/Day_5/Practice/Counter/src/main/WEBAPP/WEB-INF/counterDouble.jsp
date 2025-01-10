<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="container">
<h3>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${counter}"></c:out> times</h3>
<h3><a href="http://localhost:8080/">Go Back to the normal counter</a></h3>
<a class="btn btn-danger" href="/reset/double">Reset your visits</a>
<a class="btn btn-success" href="/double">This Button Refresh the page</a>

</body>
</html>