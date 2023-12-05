<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<h2>Login here..</h2>
<body>
	<form action="verifyLogin" method="post">
		Username <input type="text" name="email" />
		Password <input type="password" name="password" />
			<input type="submit" value="login"/>
	</form>
	<div>
		<%
			if(request.getAttribute("Error")!=null){
				out.println(request.getAttribute("Error"));
			}
		%>
	</div>
</body>
</html>