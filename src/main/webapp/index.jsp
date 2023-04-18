<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Добавить</title>
</head>
<body>
<h3>Добавить новый контакт</h3>


<form action="http://localhost:6060/contacts/" method="post" >
    <label>
        <input type="number" name="id">
    </label>Id<br><br>
    <label>
        <input type="text" name="name">
    </label>Имя<br><br>
    <label>
        <input type="text" name="lastName">
    </label>Фамилия<br><br>
    <label>
        <input type="email" name="email">
    </label>Email<br><br>
    <label>
        <input type="tel" name="tel">
    </label>Телефон<br><br>
    <input type="submit" value="Добавить">
</form>
</body>
</html>
