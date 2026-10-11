<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'This is coretag'}"></c:out>
<c:set var="balance" value="120000.2309"></c:set>

<p> Format Number(1):<fmt:formatNumber value="${balance}" type="currency"></fmt:formatNumber></p>


</body>
</html>