<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		Number 3<input type="text" name="num3"/>
		Number 4<input type="text" name="num4"/>
		<input type="submit" value="add"/>
	</form>
	<%if (request.getAttribute("resu")!=null){
		out.println(request.getAttribute("resu"));
	}
	%>
</body>
</html>