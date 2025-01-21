<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
         <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
 		 <%@ page isErrorPage="true" %> 
 		 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>Location Ninjas</h1>
	<div >
		<table class="table table-striped">
<thead>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>

</tr>
</thead>
<tbody>
<c:forEach var="ninja" items="${ninjas}" >
<tr>
<td>

 <c:out value="${ninja.firstName}"></c:out>



</td>
<td>
<c:out value="${ninja.lastName}"></c:out>

</td>
<td>
<c:out value="${ninja.age}"></c:out>
</td>
</tr>
</c:forEach>
</tbody>

</table>
	</div>
	</div>
</body>
</html>