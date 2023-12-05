<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
	<h2>Login here...</h2>
	<body>
	<form action="verifyLogin" method="post">
		Username <input type="text" name="email"/>
		Password <input type="password" name="password"/>
		<input type="submit" value="login"/>
	</form>
	<div>
		<%//division tag creates one section in our page & writing in Scriptlet tag
			if(request.getAttribute("error")!=null){ //when used !=null (not equal to null) it will not show null writtn on page
				out.println(request.getAttribute("error"));
			}
		%>
	</div>
	</body>
</html>