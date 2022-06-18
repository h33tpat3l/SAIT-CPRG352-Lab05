<%-- 
    Document   : login
    Created on : 18-Jun-2022, 4:21:19 PM
    Author     : heetk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title style="text-align: center">Login Page</title>
    </head>
    <body>
        <form method="post" action="login">
        <h1>Login</h1>
        <label>Username: </label>
        <input type="text" name="username">
        <br>
        <label>Password: </label>
        <input type="text" name="password">
        <br>
        <input type="submit" name="submit" value="Log in">
        </form>
        <p>${message}</p>
    </body>
</html>
