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
view 2: <%=Math.random() %>
<br>
<%
Calculator c = (Calculator)config.getServletContext().getAttribute("model");
String msg = c.greet(request.getParameter("user"));
%>

<%=msg %>

</body>
</html>