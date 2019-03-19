<%@ page import="com.capgemini.heskuelita.core.beans.User" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<title>Login successfully!</title>

</head>


<body style="background-color:#e6fff7;">



<div class="container bg-light">
    <div class="jumbotron text-center bg-dark"  style="background-color:black;">
        <%User us = (User)session.getAttribute ("user");%>
        <h1 style="color:white;">Welcome to Heskuelita project, <%=us.getFirst_name()%>!<br></h1>



        <div class="row">
            <div class="col">

                <div class="col text-center text-white" style="background-color:black;" >
                    <div style="color:white;">
                        Login succesfully!<br>

                        User&email: <%=us.getUserName() + ",  " + us.getEmail()%><br>
                    </div>
                    <br><img class="img-circle"  src="https://fm.cnbc.com/applications/cnbc.com/resources/img/editorial/2017/11/17/104849155-6ED3-REQ-111717-CapGemini.1910x1000.jpg" alt="" width="1000" height="180">
                </div>

            </div>

        </div>


    </div>

</div>
</body>
</html>


