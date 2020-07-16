<%--
  Created by IntelliJ IDEA.
  User: MUHILE
  Date: 7/14/2020
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<div align="center">
    <h1>Outdoor Gear Rental</h1>
    <h2>
        <a href="new">Add New User</a>
        &nbsp;&nbsp;&nbsp;
        <a href="list">List All Users</a>

    </h2>
</div>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Gear</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="rental" items="${listUser}">
            <tr>
                <td><c:out value="${rental.id}" /></td>
                <td><c:out value="${rental.name}" /></td>
                <td><c:out value="${rental.email}" /></td>
                <td><c:out value="${rental.country}" /></td>
                <td>
                    <a href="edit?id=<c:out value='${rental.id}' />">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="delete?id=<c:out value='${rental.id}' />">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
