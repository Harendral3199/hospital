<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add Patient</title>
</head>
<body>
  <h1>Add Patient</h1>
  <form action="${pageContext.request.contextPath}/add" method="post">
    <label>Name:<br/><input type="text" name="name" required/></label><br/>
    <label>Age:<br/><input type="number" name="age" min="0"/></label><br/>
    <label>Diagnosis:<br/><input type="text" name="diagnosis"/></label><br/><br/>
    <button type="submit">Add</button>
  </form>
  <p><a href="${pageContext.request.contextPath}/patients">Back to list</a></p>
</body>
</html>
