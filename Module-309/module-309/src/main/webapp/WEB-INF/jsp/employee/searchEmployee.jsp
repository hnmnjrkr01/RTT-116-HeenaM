<%--
  Created by IntelliJ IDEA.
  User: hnmnj
  Date: 12/15/2024
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../include/header.jsp"/>

<section class="bg-light2 pt-5 pb-5" style="text-align: center">
    <div class="container">
        <h1>Employee Search Page</h1>
        <h3>Employees Found(${employees.size()})</h3>
    </div>
</section>


<section class="bg-light1 pt-5 pb-5">
<div class="container ">
    <form action="/employee/searchEmployee" class="mb-0 pt-4 pb-4">
        <div class="row pt-3 justify-content-center">
            <div class="col-6">

                <div class="mb-3">
                    <label for="firstNameId" class="form-label">First Name</label>
                    <input type="text" class="form-control" id="firstNameId" name="firstName" value="${searchFirstName}">
                </div>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col-6">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </div>
    </form>
</div>
</section>
<section class="bg-light2 pt-5 pb-5 text-center">
<div class="container">

<table class="table mb-0">
    <tr>
        <th>Employee-Id</th>
        <th>Employee Firstname</th>
        <th>Employee Lastname</th>
        <th>Employee Office-Id</th>
    </tr>

        <c:forEach var="emp" items="${employees}">
           <tr>
               <td>${emp.id}</td>
               <td>${emp.firstName}</td>
               <td>${emp.lastName}</td>
               <td>${emp.officeId}</td>
               <td><a href="/employee/edit/${emp.id}">Edit</a></td>
           </tr>
        </c:forEach>
</table>
</div>
</section>

<jsp:include page="../include/footer.jsp"/>