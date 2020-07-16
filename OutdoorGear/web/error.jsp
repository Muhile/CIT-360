<%--
  Created by IntelliJ IDEA.
  User: MUHILE
  Date: 7/14/2020
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <style>
        #head {text-align: center;}
    </style>
</head>
<body>
    <div id="head">
        <h1>Error</h1>
        <h2><%=exception.getMessage() %><br/> </h2>
    </div>
</body>
</html>
