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
    <title>User Form</title>
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
    <c:if test="${rental != null}">
    <form action="update" method="post">
        </c:if>
        <c:if test="${rental == null}">
        <form action="insert" method="post">
            </c:if>
            <table border="1" cellpadding="5">
                <caption>
                    <h2>
                        <c:if test="${rental != null}">
                            Edit Rental
                        </c:if>
                        <c:if test="${rental == null}">
                            Add New Rental
                        </c:if>
                    </h2>
                </caption>
                <c:if test="${rental != null}">
                    <input type="hidden" name="id" value="<c:out value='${rental.id}' />" />
                </c:if>
                <tr>
                    <th>User Name: </th>
                    <td>
                        <input type="text" name="name" size="45"
                               value="<c:out value='${rental.name}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>User Email: </th>
                    <td>
                        <input type="text" name="email" size="45"
                               value="<c:out value='${rental.email}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Gear: </th>
                    <td>
                        <input type="text" name="gear" size="15"
                               value="<c:out value='${rental.country}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>
