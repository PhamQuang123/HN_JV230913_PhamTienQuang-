<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 06/05/2024
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách sinh viên</title>
</head>
<body>
<a href="/newAdd"><button>Thêm mới</button></a>
<table border="1">
    <thead>
    <th>ID</th>
    <th>Name</th>
    <th>Image</th>
    <th>Date Of Birth</th>
    <th>Sex</th>
    <th>Phone Number</th>
    <th>Address</th>
    <th colspan="2">Action</th>
    </thead>
    <tbody>

   <c:forEach items="${listStudents}" var="st">
       <tr>
           <td>${st.studentId}</td>
           <td>${st.studentName}</td>
           <td>${st.imgUrl}</td>
           <td>${st.birthday}</td>
           <td>${st.sex}</td>
           <td>${st.phoneNumber}</td>
           <td>${st.address}</td>
           <td><a href="/edit?studentId=${st.studentId}">EDIT</a></td>
           <td><a href="/delete?studentId=${st.studentId}">DELETE</a></td>
       </tr>
   </c:forEach>
    </tbody>
</table>

</body>
</html>
