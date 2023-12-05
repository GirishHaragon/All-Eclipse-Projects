<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP - Tags</title>
</head>
<body>
	<h1>Directive Tag</h1>
	<h3>1.Page Directive Tag</h3>
	<%//We can use Date keyword in Java to get Date&Time stamp by importing it from util package.
		//But in JSP we cannot import anything like in .java file.  That's where Page directive tags used.
	%>
	<%@ page import="java.util.Date, java.util.ArrayList" %>
	<%= new Date() %>
	<%= new ArrayList<String>() %>
	<h3>2.Include Directive Tag</h3>
	
</body>
</html>