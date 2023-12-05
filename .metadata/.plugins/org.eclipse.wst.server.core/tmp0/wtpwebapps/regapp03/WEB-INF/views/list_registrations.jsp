<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.sql.ResultSet" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All registrations</title>
</head>
<body>
	<h2>All Registrations..</h2>
	<table border='5'>
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
			ResultSet result = (ResultSet)request.getAttribute("result");//Here actually class DownCasting is happening
				//This above line shows error bcz the method getAttribute gives the return type as Object. 
				//but we r storing it in ResultSet.
		
		while (result.next()) { %>
			
		<tr>
			<td><%=result.getString(1) %></td>
			<td><%=result.getString(2) %></td>
			<td><%=result.getString(3) %></td>
			<td><%=result.getString(4) %></td>
			<td><a href="delete?email=<%=result.getString(3)%>">Delete</a>
			<td><a href="update?email=<%=result.getString(3)%>&mobile=<%=result.getString(4)%>&name=<%=result.getString(1)%>&city=<%=result.getString(2)%>">Update</a>
		</tr>
		<%} %>
	</table>
</body>
</html>