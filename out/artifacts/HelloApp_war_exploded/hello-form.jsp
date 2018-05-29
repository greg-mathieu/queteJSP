<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="custom-hello" method="post">
    <h1>Hello</h1>
    <p>
        <label for="firstname">What's your firstname?</label>
        <input id="firstname" name="firstname">
    </p>
    <p>
        <label for="lastname">What's your lastname?</label>
        <input id="lastname" name="lastname">
    </p>
    <p>
        <label for="hour">What time is it?</label>
        <input id="hour" name="hour" type="number" min="0" max="23">
    </p>
    <p>
        <input type="submit" value="Valid">
    </p>
</form>

</body>
</html>
