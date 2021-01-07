<%@page import="calculator.core.Calculator"%>
<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Insert title here</title>
</head>
<body>
view 1
<br>
<%
double a = Double.parseDouble(request.getParameter("a"));
double b = Double.parseDouble(request.getParameter("b"));
Calculator c = (Calculator)config.getServletContext().getAttribute("model");
double sum = c.add(a, b);
%>
<%=a%> + <%=b%> = <%=sum%> 
</body>
</html>