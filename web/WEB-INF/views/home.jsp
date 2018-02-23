<%--
  Created by IntelliJ IDEA.
  User: Andriy
  Date: 22-Feb-18
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${pageTitle}</title>    <%--pageTitle відповідає modelAndView.addObject("pageTitle", "Home Page"); в HomeController --%>
</head>
<body>
${message}             <%-- message відповідє modelAndView.addObject("message", "Hi, Welcome");--%>
</body>
</html>


