<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%="welcome ="+request.getParameter("uname") %>
<% String drive=config.getInitParameter("dname");
out.println("the driver="+drive);%>

</body>
</html>