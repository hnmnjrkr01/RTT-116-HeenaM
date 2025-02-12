<%--
  Created by IntelliJ IDEA.
  User: hnmnj
  Date: 12/13/2024
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>


<html>
<head>
    <title></title>
  <!-- these 2 lines are needed to bring in bootstrap -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
          crossorigin="anonymous"></script>
  <!-- jquery is always loaded at the top of the file because its needed by so many other libraries -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<link href="/pub/css/global.css" rel="stylesheet"/>

</head>
<body>

<section>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/index">Index</a>
          </li>
          <li class="nav-item">
            <sec:authorize access="hasAuthority('CUSTOMER')">
            <a class="nav-link" href="/customer/search">Customer Search</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/customer/create">Create Customer</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/customer/ajaxExample">Ajax Example</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/employee/searchEmployee">Employee Search</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/employee/create">Create Employee</a>
          </li>
          </sec:authorize>
          <li class="nav-item">
            <a class="nav-link" href="/login/createUser">Create User</a>
          </li>
          <sec:authorize access="!isAuthenticated()">
            <li class="nav-item">
              <a class="nav-link" href="/login/login">Login</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/login/signUp">SignUp</a>
            </li>
          </sec:authorize>
          <sec:authorize access="isAuthenticated()">
            <li class="nav-item">
              <a class="nav-link" href="/login/logout">Logout</a>
            </li>

          </sec:authorize>
        </ul>
      </div>
    </div>
  </nav>
</section>



