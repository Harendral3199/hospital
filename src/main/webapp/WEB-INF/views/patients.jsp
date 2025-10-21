<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Hospital - Patients</title>
</head>
<body>
  <h1>Patients</h1>
  <a href="${pageContext.request.contextPath}/add">Add Patient</a>
  <table border="1" cellpadding="6" cellspacing="0">
    <tr><th>ID</th><th>Name</th><th>Age</th><th>Diagnosis</th></tr>
    <c:forEach var="p" items="${patients}">
      <tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
        <td>${p.age}</td>
        <td>${p.diagnosis}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
