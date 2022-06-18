<%-- 
    Document   : home
    Created on : 18-Jun-2022, 4:37:16 PM
    Author     : heetk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>
           Hello ${UserName} !
        </p>
        <a href="login?logout">Log Out</a>
    </body>
</html>
