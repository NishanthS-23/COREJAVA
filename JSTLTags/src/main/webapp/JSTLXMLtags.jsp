<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL XML tags</title>
</head>
<body>	
<h1>Vegetable info</h1>
<c:set var="vegtables">
<vegetables>
<veg>
<name>oni</name>
<price>12</price>
</veg>
<veg>
<name>tomato</name>
<price>25</price>
</veg>
</vegetables>
</c:set>
<x:parse xml="${vegtables}" var="output"></x:parse>
<b>veg name:<x:out select="$output/vegetables/veg[1]/name"/></b><br>
<b>veg price:<x:out select="$output/vegetables/veg[2]/price"/></b>
</body>
</html>