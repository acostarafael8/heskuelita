<%@ page import="com.capgemini.heskuelita.core.beans.User" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Login successfully!</title>

</head>


<body class=bg-secondary>



<div class="container bg-light">
    <div class="jumbotron text-center bg-dark text-white">
        <h1>Welcome to Heskuelita project!<br></h1>



        <div class="row">
            <div class="col">

            <div class="col text-center">

                Login succesfully!<br>
                <%User us = (User)session.getAttribute ("user");%>
                User&email: <%=us.getUserName() + ",  " + us.getEmail()%><br>
                First name: <%=us.getFirst_name()%><br>
                Last name: <%=us.getLast_name()%> <br>

             </div>

            </div>
        </div>
    </div>
</div>


