<%--
  Created by IntelliJ IDEA.
  User: fvg
  Date: 10/3/2019
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Sign Up</title>

</head>


<body class=bg-secondary>

<form action="signup" method="post">

    <div class="container bg-light">
        <div class="jumbotron text-center bg-dark text-white">
            <h1>Registration Form <br></h1>
            <p>Complete the following information to complete your registration </p>
        </div>

        <div class="row">
            <div class="col-md-2 mb-3">
                <label>First name</label>
                <input class="form-control" name="first_name"  type="text" >
            </div>

            <div class="col-md-2 mb-3">
                <label>Last name</label>
                <input class="form-control" name="last_name" type="text">
            </div>
        </div>

        <div class="row">
            <div class="col-md-3 mb-3">
                <label>Birthday</label>
                <input class="form-control" name="birthday" type="text" placeholder="DD/MM/YYYY"/>
            </div>
        </div>

        <div class="radio-inline col-md-2 mb-3">

            Gender: <br>
            <input type="radio" name="gender" value="male" checked> M
            <input type="radio" name="gender" value="female"> F
            <input type="radio" name="gender" value="other"> Other <br>
        </div>


        <div class="row">
            <div class="col-md-2 mb-8">
                <label>Document Type:</label>
                <select class="form-control" name="doc_type">
                    <option>DNI</option>
                    <option>CI</option>
                    <option>LE</option>
                    <option>Passport</option>
                </select>
            </div>

            <div class="col-md-2 mb-3">
                <label>Identification </label>
                <input class="form-control" name="identification" type="text" >
            </div>
        </div>

        <div class="row">
            <div class="col-md-2 mb-3">
                <label>Phone</label>
                <input class="form-control" name="phone" type="text" >
            </div>
        </div>

        <div class="row">
            <div class="col-md-2 mb-3">
                <label >Adress</label>
                <input class="form-control" name="adress"  type="text" >
            </div>
            <div class="col-md-2 mb-3">
                <label>Zip Code</label>
                <input class="form-control" name="zipcode"  type="text" >
            </div>
        </div>

        Introduce your username, email and select your password <br>
        <div class="row">
            <div class="col-md-2 mb-3">
                <input type="text" id="input_user" name="username" class="form-control" placeholder="Username">
                <label for="inputEmail" class="sr-only"></label>
                <input type="email" id="inputEmail" class="form-control" name="email" placeholder="Email address">
                <label for="inputPassword" class="sr-only"></label>
                <input type="password" id="inputPassword" class="form-control" name="pwd" placeholder="Password">
            </div>
        </div>


        <button type="submit" class="btn btn-success btn-md">Submit</button>

</form>

</div>









<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


</body>



</html>


