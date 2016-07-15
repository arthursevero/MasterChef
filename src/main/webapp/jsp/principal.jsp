<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form method="post" action="controller">
    <p>
        <label for="login">Kibe:</label><br/> <input type="text"
                                                      name="login" id="login" value=""/>
    </p>

    <p>
        <label for="password">Kibado:</label><br/> <input type="password"
                                                            name="password" id="password" value=""/>
    </p>

    <p>${error}</p>

    <p>
        <input type="submit" value="Log in"/>
    </p>
    <input type="hidden" name="command" value="login"/>
</form>
</body>
</html>