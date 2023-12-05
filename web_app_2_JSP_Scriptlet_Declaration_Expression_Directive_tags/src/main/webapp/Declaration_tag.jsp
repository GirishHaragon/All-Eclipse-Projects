<%@page import="org.eclipse.jdt.internal.compiler.batch.Main"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP - Tags</title>
</head>
<body>
	<h2>Declaration Tag Example</h2>
	<%!//We can use Access Specifiers and Method creation inside Declaration tag.
		public int x = 10;
		public int test(){
			return 100;
		}
		//System.out.println(x);//This is showing error maybe bcz we used implicit object out here
	%>
	<% 
		System.out.println(x);//Console = 10
		out.println(test());//Web page = 100
	%>
</body>
</html>