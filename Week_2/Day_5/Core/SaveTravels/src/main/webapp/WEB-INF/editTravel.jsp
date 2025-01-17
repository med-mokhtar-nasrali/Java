<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
                <%@ page isErrorPage="true" %>
                    <!DOCTYPE html>
                    <html>

                    <head>
                        <meta charset="UTF-8">
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
                            rel="stylesheet"
                            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                            crossorigin="anonymous">
                        <title>Edit Expenses</title>
                        <style>
                            .card-custom {
                                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                                border-radius: 10px;
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
                        <div class="container p-4 mt-5 card card-custom">
                            <div class="gradient-header">
                                <div class="d-flex justify-content-between align-items-center">
                                    <h1>Edit Expenses :</h1>
                                    <a href="/expenses" class="btn btn-success">Home</a>
                                </div>
                            </div>
                            <form:form modelAttribute="travel" method="POST" action="/expenses/edit/${travel.id}">
                                <div class="mb-3">
                                    <input type="hidden" name="_method" value="PUT">
                                    <form:label path="name"><strong>Expenses Name:</strong></form:label>
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

                                <button type="submit" class="btn btn-success mt-3">Edit</button>
                            </form:form>
                        </div>
                    </body>

                    </html>