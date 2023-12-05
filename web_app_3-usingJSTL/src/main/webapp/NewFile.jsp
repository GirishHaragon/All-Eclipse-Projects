<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="x" value="100"></c:set> <%//To write int x=100. All the values we store it in double quotes. %>
	<c:out value="mike"></c:out><%//we can change C: by changing prefix in the taglib directive tag as eg. a to z: %>
	<c:out value="${x}"></c:out><%//Because x is a variable we should write out in ${x} %>
	<%//No need to remember all these tags and their patterns, we can find all these in online & search for jstl core tags & in any websites for eg- javatpoint.com %>
	<c:set var="income" value="${4000*4}"/><%//We firstly remove the scope="session", this is nothing but session variable. Why there is $ in value bcs it has expression in it so the value in it will become 16000 %>
		<c:if test="${income > 8000}"><%//Condition in if block here is test="" it will now check income > 8000 %>  
   			<p>
   				My income is: 
   				<c:out value="${income}"/>
   			<p>  
		</c:if>
		  
		<c:forEach var="j" begin="1" end="3">
			Item <c:out value="${j}"/>
			<p><%//Paragraph tag here makes the Item printed line below line %>
		</c:forEach>
</body>
</html>