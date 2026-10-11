<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.Date, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPDirective</title>
</head>
<body>
<p>today is:<%=new Date().toString() %></p>
<p>Number :<%=Math.random() %><p><br> 
<%
 ArrayList<String> a1=new ArrayList<>();
a1.add("java");
a1.add("php");
a1.add("python");
a1.add("ruby");

for(String s:a1)
{
	%>
	<p style='color:brown;' align='center'>
	<% out.println(s);%>
	</p>
	<%
}
%>
</body>
</html>