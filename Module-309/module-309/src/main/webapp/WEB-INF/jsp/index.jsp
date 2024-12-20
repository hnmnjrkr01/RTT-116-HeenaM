 <%--
  Created by IntelliJ IDEA.
  UserDAO: hnmnj
  Date: 12/10/2024
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


  <jsp:include page="include/header.jsp"/>

 <section class="bg-light2">
  <h1>First JSP Page</h1>

  <p>Welcome to First JSP Page</p>

  <table border="2">
    <tr >
      <th>Contact First Name</th>
      <th>Contact Last Name</th>
      <th>id</th>
      <th>Customer Name</th>
    </tr>

    <c:forEach var="name" items="${customerFirstNames}">
      <tr>
        <td>${name.contactFirstname}</td>
        <td>${name.contactLastname}</td>
        <td>${name.id}</td>
        <td>${name.customerName}</td>
      </tr>
    </c:forEach>
  </table>
 </section>
 <jsp:include page="include/footer.jsp"/>