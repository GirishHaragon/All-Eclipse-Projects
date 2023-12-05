<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>New Registration..</h1>
	<form action="saveReg" method="post" style="font-size: 18px;">
<pre>
	Name   <input type="text" name="name"/>
	City   <input type="text" name="city"/>
	Email  <input type="text" name="email"/>
	Mobile <input type="number" name="mobile"/>
			    <input type="submit" value="save"/>   
</pre>
<div>
<%//division tag creates one section in our page & writing in Scriptlet tag
			if(request.getAttribute("msg")!=null){ //when used !=null (not equal to null) it will not show null writtn on page
				out.println(request.getAttribute("msg"));
			}
	%>
</div>
	</form>
</body>
</html>