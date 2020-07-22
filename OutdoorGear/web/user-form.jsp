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
    <title>Rental Form</title>
    <style>
        * {
            box-sizing: border-box;
        }

        input[type=text], select,input[type=email] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            resize: vertical;
        }

        label {

            display: inline-block;
        }

        input[type=submit] {
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 16px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            float: right;
            transition-duration: 0.4s;
            cursor: pointer;
        }


        input[type=submit]:hover {
            background-color: white;
            color: black;
            border: 2px solid #4CAF50;
        }

        .container {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }

        .col-25 {
            float: left;
            width: 25%;
            margin-top: 6px;
        }

        .col-75 {
            float: left;
            width: 75%;
            margin-top: 6px;
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }

        /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 600px) {
            .col-25, .col-75, input[type=submit] {
                width: 100%;
                margin-top: 0;
            }
        }

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

    <p>Enter your oder below.</p>

    <div class="container">
        <form action="insert" method="post">
            <div class="row">
                <div class="col-25">
                    <label>Name</label>
                </div>
                <div class="col-75">
                    <input type="text" name="name" placeholder="Your Name.." required>
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label>Email</label>
                </div>
                <div class="col-75">
                    <input type="email" name="email" placeholder="Your Email.." required>
                </div>
            </div>
            <div class="row">
                <div class="col-25">
                    <label>Gear</label>
                </div>
                <div class="col-75">
                    <input type="text" name="gear" placeholder="Gear.." required>
                </div>
            </div>
            <div class="row">
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
</body>
</html>
