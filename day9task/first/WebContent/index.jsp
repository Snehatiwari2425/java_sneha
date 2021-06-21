<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:blue;">welcome this is my first jsp file</h3>
<% out.print(2*5); %>

<h5>now we will see use of declaration tag using it we can declare variable as well as methods.</h5>
<%! int data=50; %>                  <%-----------this is the declaration tag --%>
<%= "value of data is="+data %>
<%! 
int  multiple(int n){
return n*n*n;
}
%>
<br/>
<h3 style="color:red;">
<%= "the multiple of the number 5="+multiple(5) %></h3>

<a>Date is:</a>
<% out.print(new java.util.Date());%>

<% application.getContextPath(); %>
<% session.setAttribute("user", "sneha"); %>
<a href="New.jsp">click here to get the user-name</a>



</body>
</html>