<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 06/05/2024
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>thêm mới</title>
</head>
<body>
<form action="/update" method="post">
    <label>ID:</label>
    <input type="text" name="studentId" id="studentId"><br>

    <label> Name:</label>
    <input type="text" name="studentName" id="studentName"/><br>

    <label>birthday:</label>
    <input type="date" name="birthday" id="birthday"/><br>

    <label>Image:</label>
    <input type="file" name="imgUrl" id="imgUrl"/><br>

    <label>Phone:</label>
    <input type="text" name="phoneNumber" id="phoneNumber"/><br>

    <label>Address:</label>
    <input type="text" name="address" id="address"/><br>

    <label>Sex:</label>
    <input type="radio" name="sex" id="active" value="true"/><label>Nam</label>
    <input type="radio" name="sex" id="inActive" value="false"/><label>Nữ</label><br>

    <input type="submit" value="Add New">
</form>
</body>
</html>
