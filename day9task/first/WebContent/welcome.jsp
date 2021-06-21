<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<form>
<%response.sendRedirect("http://www.google.com"); %>  <%----------this is the syntax of  scriptlet tag used to add java code in jsp file  --%>
<% String name=request.getParameter("username");
out.println("welcome="+name);%><br/>

<%= "hello sneha i think this is your first program" %>    <%--------------------------this is the expression tag of jsp --%>


</form>

</body>
</html>