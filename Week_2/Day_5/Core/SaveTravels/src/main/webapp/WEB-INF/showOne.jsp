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
                        <title>Show One</title>
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

                            .card-body-custom {
                                border-radius: 10px;
                                background: #f8f9fa;
                                padding: 15px;
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
                            <div class="gradient-header d-flex justify-content-between align-items-center">
                                <h1 class="mb-0">Expenses Details</h1>
                                <a href="/expenses" class="btn btn-success">Home</a>
                            </div>
                            <div class="card-body-custom">
                                <p><strong>Expenses Name:</strong> ${travel.name}</p>
                                <p><strong>Expenses Description:</strong> ${travel.description}</p>
                                <p><strong>Vendor:</strong> ${travel.vendor}</p>
                                <p><strong>Amount:</strong> ${travel.amount}</p>
                            </div>
                        </div>
                    </body>

                    </html>