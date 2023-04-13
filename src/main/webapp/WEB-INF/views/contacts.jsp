<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Контакты</title>
</head>
<body>
<h2>Список контактов</h2>
<table>
    <c:forEach var="contact" items="${contactList}">

    </c:forEach>
</table>
<h2><a href="/edit">edit page</a> </h2>
</body>
</html>
