<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="age" value="10"/>
		<c:choose>
			 <c:when test="${age >= 18}">
			    <button>Hey Cutie</button>
			 </c:when>
			 <c:when test="${age < 18}">
			     <button>Open up FBI</button>
			 </c:when>
		</c:choose>
</body>
</html>