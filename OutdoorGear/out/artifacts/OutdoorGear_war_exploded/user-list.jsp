<%@ page import="gearrental.Rental" %>
<%@ page import="gearrental.JSON" %><%--
  Created by IntelliJ IDEA.
  User: MUHILE
  Date: 7/14/2020
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gear List</title>
    <style>
        a {
            background-color: black;
            border: none;
            border-radius: 4px;
            color: white;
            padding: 16px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            transition-duration: 0.4s;
            cursor: pointer;
        }

        a:hover {
            background-color: white;
            color: black;
            border: 2px solid black;
        }
    </style>
</head>
<body>
<h1 align="center">Outdoor Gear Rental</h1>
<h2 align="center">
    <a href="new">Rent Gear</a>
    <a href="list">Current Rentals</a>
</h2>
<h3 align="center">Here is a list of the Current Rentals in our store</h3>

<div align="center">
    ${listUser}
</div>
</body>
</html>
