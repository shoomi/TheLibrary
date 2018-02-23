<%--
  ця jsp має обовязково називатись index, так само як і на сервері index.html, який грузиться як початкова сторінка
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index Page</title>
  </head>
  <body>
  <a href="/home">Go to home page</a>    <%--створюємо ссилку яка буде переключати на home.jsp--%>
  <p>Some another page</p>
  <a href="/anotherpage">Go to another page</a>
  </body>
</html>


