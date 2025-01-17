<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
                <%@ page isErrorPage="true" %>
                    <!DOCTYPE html>
                    <html>

                    <head>
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
                            rel="stylesheet"
                            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                            crossorigin="anonymous">
                        <meta charset="UTF-8">
                        <title>Expenses</title>
                        <style>
                            .card-custom {
                                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                                border-radius: 10px;
                            }

                            .table-hover tbody tr:hover {
                                background-color: #f5f5f5;
                            }

                            .form-control {
                                border-radius: 5px;
                                border: 1px solid #ced4da;
                                margin-bottom: 15px;
                            }

                            .btn-primary {
                                background-color: #007bff;
                                border-color: #007bff;
                            }

                            .btn-primary:hover {
                                background-color: #0056b3;
                                border-color: #004085;
                            }

                            .gradient-header {
                                background: linear-gradient(to right, #007bff, #0056b3);
                                color: white;
                                padding: 15px;
                                border-radius: 10px 10px 0 0;
                                margin-bottom: 20px;
                            }
                        </style>
                    </head>

                    <body>
                        <div class="container p-4">
                            <h1 class="mb-3 text-center gradient-header">Save Travels</h1>
                            <div class="card card-custom p-3 mb-4">
                                <table class="table table-striped table-hover">
                                    <thead>
                                        <tr>
                                            <th>Expenses</th>
                                            <th>Vendor</th>
                                            <th>Amount</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="travel" items="${travels}">
                                            <tr>
                                                <td><a href="/expenses/${travel.id}">${travel.name}</a></td>
                                                <td>${travel.vendor}</td>
                                                <td>${travel.amount}</td>
                                                <td>
                                                    <div class="d-flex gap-2">
                                                        <a href="/expenses/edit/${travel.id}"
                                                            class="btn btn-secondary btn-sm">Edit</a>
                                                        <form action="/expenses/delete/${travel.id}" method="post">
                                                            <input type="hidden" name="_method" value="DELETE">
                                                            <input type="submit" value="Delete"
                                                                class="btn btn-danger btn-sm">
                                                        </form>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="card card-custom p-3">
                                <h1>Add An Expense</h1>
                                <form:form modelAttribute="travel" method="POST" action="/expenses">
                                    <div class="mb-3">
                                        <form:label path="name"><strong>Expense Name:</strong></form:label>
                                        <form:input type="text" path="name" class="form-control" />
                                        <form:errors class="badge text-danger" path="name" />
                                    </div>
                                    <div class="mb-3">
                                        <form:label path="vendor"><strong>Vendor:</strong></form:label>
                                        <form:input type="text" path="vendor" class="form-control" />
                                        <form:errors class="badge text-danger" path="vendor" />
                                    </div>
                                    <div class="mb-3">
                                        <form:label path="amount"><strong>Amount:</strong></form:label>
                                        <form:input type="text" path="amount" class="form-control" />
                                        <form:errors class="badge text-danger" path="amount" />
                                    </div>
                                    <div class="mb-3">
                                        <form:label path="description"><strong>Description:</strong></form:label>
                                        <form:textarea path="description" class="form-control"></form:textarea>
                                        <form:errors class="badge text-danger" path="description" />
                                    </div>
                                    <button type="submit" class="btn btn-success mt-3">Submit</button>
                                </form:form>
                            </div>
                        </div>
                    </body>

                    </html>