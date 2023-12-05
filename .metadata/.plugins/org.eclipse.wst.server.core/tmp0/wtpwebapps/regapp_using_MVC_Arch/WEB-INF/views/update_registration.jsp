<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<%
	//This file can only be called through a servlet when its path is in WEB-INF folder, Any file that we create in WEB-INF Folder that cannot be accessed directly Only a servlet can call that file this gives us some amount of security
	//Now how can a servlet call this file? Ans. A servlet can call this file using requestDispatcher in controller.
//All our HTML Code goes in Views which cannot directly accessed
%>
<body>
	<h2>Update Registration...</h2>
	<form action="update" method="post"  style="font-size:18px;">
<pre>
	Email  : <input type="text" name="email" value="<%=request.getAttribute("email")%>" /><br><%//we have given another parameter 'value' just to get the email which was present in the DB before Updating to see what to update, & NoSpaceInExpTag %>
	Mobile : <input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>" /><br>
				<input type="submit" value="Update" />
</pre>
	</form>
</body>
</html>