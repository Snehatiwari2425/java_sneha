<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="Day1Task.Calculator" scope="session"/>
<%
int m=obj.square(5);
%>

<%= "welcome you forwarded page" %>
<%= new java.util.Date() %>



</body>
</html>