<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name= (String)session.getAttribute("user");
out.println("user name is="+name);%>

<form action="process.jsp">
N1:<input type="text" name="n1"><br/>
N2:<input type="text" name="n2"><br/>
<input type="submit" value="divide">
</form>






</body>
</html>