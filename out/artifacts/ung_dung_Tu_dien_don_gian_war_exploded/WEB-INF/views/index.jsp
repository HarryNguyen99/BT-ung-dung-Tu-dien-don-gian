<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: harrynguyen
  Date: 28/05/2020
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form:form method="post">
    <h1>Từ Điển</h1>
    <input type="text" name="TA"> <br><br>
    <p>${result}</p>
    <input type="submit" name="submit">
  </form:form>
  </body>
</html>
