<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Numericals</title>
</head>
<body>
	<form action="add" method="post">
		number 1<input type="text" name="num1"/>
		number 2<input type="text" name="num2"/>
		<input type="submit" value="add"/>
	</form>
	
	<%
	if(request.getAttribute("res")!=null){ //(!=) means not equal to null
		out.println(request.getAttribute("res"));	
	}
	%>
</body>
</html>