<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First jsp</title>
</head>
<body>
<%
out.println("my first jsp program");
%>
<%--delcare variable --%>
<%!int x=10,y=5,z=15;
String name="nishanth";
%>
<%--expression tag--%>
<% z=x+y;  %>
<%--scriplet tag --%>
<%
out.println(z);
out.println(name);
%>
</body>
</html>