<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
      <title>Тест</title>
  </head>
  <body>
      <h1>Привет, мир!</h1>
      <a href="/test">Переход на другую страницу</a>
      ${group}
      <img src="<c:url value="/resources/static/0b0302775cf81c4ec7581eaedd3b1a0f.jpg" />" >
  </body>
</html>
