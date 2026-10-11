<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<jsp:useBean id="str" class="com.bean.Message"></jsp:useBean>
<%
String msg="Hello world";
str.setS(msg);
String m=str.getS(); 
 out.print(m);
%>
</body>
</html>