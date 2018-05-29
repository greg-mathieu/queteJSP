<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="custom.css" rel="stylesheet" type="text/css">
</head>
<body>

<p><%   String message = (String) request.getAttribute("message");
        out.print(message);
%> </p>

</body>
</html>
