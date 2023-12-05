<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP - Tags</title>
</head>
<body>
	<h1>Declaration Tag Example</h1>
	<h3>1.Page Directive Tag</h3>
	<%@ page import="java.util.ArrayList, java.util.Date" %>
	<%= new Date() %>
	<%= new ArrayList<Integer>() %>
	<%//The ArrayList shows warning if i don't use Generic, 
	    //And i can't even store the reference of It's Parent clas. %>
</body>
</html>