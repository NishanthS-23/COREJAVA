<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Function.jsp</title>
</head>
<body>
<h1>JSTL Fuctions</h1>
<c:set value="I am a full stack java developer" var="msg"></c:set>
<c:set value="${fn:split(msg,' ') }" var="msgArray"></c:set>
<p> message:${msg} </p>
<p> message contains 'java':${fn:contains(msg,'java') } </p>
<p> message containsIgnoreCase 'java':${fn:containsIgnoreCase(msg,'jaVa') } </p>
<p> message Ends With 'developer':${fn:endsWith(msg,'developer') } </p>
<p> message Index Of 'a':${fn:indexOf(msg,'a')} </p>
<p> MsgArray:${msgArray[0]}</p>	
<c:forEach items="${msgArray}" var="msg2">
<p> Message:${msg2}</p>  
</c:forEach>
<p>message 2 Joins with '-':${fn:join(msgArray, '-')}</p>
<p>Length of Message:${fn:length(msg) }</p> 
</body>
</html>