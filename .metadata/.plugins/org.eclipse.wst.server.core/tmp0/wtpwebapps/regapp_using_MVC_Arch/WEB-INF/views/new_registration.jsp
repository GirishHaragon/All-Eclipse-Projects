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
	<h1>New Registration...</h1>
	<form action="saveReg" method="post"  style="font-size: 18px;">
<pre>
	Name   : <input type="text" name="name"/><br>
	City   : <input type="text" name="city"/><br>
	Email  : <input type="text" name="email"/><br>
	Mobile : <input type="text" name="mobile"/><br>
				<input type="submit" value="save"/>
</pre>
	</form>
	<div>
	<%//division tag creates one section in our page & writing in Scriptlet tag
			if(request.getAttribute("msg")!=null){ //when used !=null (not equal to null) it will not show null writtn on page
				out.println(request.getAttribute("msg"));
			}
	%>
	</div>
</body>
</html>