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
        <tr>
            <td>${contact.id}</td>
            <td> ${contact.name}</td>
            <td> ${contact.lastName}</td>
            <td>Email: ${contact.email}</td>
            <td>Телефон: ${contact.tel}</td>
            <td><a href="http://localhost:6060/contacts/${contact.id}">
                <button>Удалить</button>
            </a>
                <a href="http://localhost:6060/edit/${contact.id}">
                    <button>Изменить</button>
                </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
