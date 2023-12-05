<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All registrations</title>
</head>
<body>
	<h2>All Registrations...</h2>
	<table border='1'>
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
			ResultSet result = (ResultSet)request.getAttribute("result");//At first ResultSet will show error then we import it using ctrl+space ResultSet-java.sql, but then the request.getAtt will get error bcs this is returning object and we r storing it in ResultSet hence lets do class downcasting
		//bcs the return type of request.getAttribute is object, but we are storing it in ResultSet. When object is converted to ResultSet, it is parent to child class and calls as Class downCasting. Always the supermost class is Object. we can check keeping the cursor on getAttr it'll show the class of it as object. so we need class downCasting there to remove error.
		//All the classes that we create is a child class of Object, if it is returning object we should convert it to required ResultSet Child class
			while(result.next()){ %>
			<tr>
				<td><%=result.getString(1) %><%//used expression tag here %></td>
				<td><%=result.getString(2) %></td>
				<td><%=result.getString(3) %></td>
				<td><%=result.getString(4) %></td>
				<td><a href="delete?email=<%=result.getString(3)%>">Delete</a></td>
				<td><a href="update?email=<%=result.getString(3)%>&mobile=<%=result.getString(4)%>">Update</a></td><%//to supply email and mobile both to the backend we use & without any sapces anywhere in the statement and any number of values can be supplied to the backend using &. %>
			<%//the tag used here is called Anchor Tag
				//Earlierly what we did is we developed a form, we submit the form, the servlet reads the data from the form.
				//But now what we r doing is, we will develop a link and we will supply the datas in the links not in the form this is called QuerryParameters
				//Whenever we give QueryParameters the syntaxes we give with a ?, like delete?  and then we give there the attribute name which can be anything like "delete?id=<%=result.getString(3)%//>" here no spaces should be left in ""s or else email string will get space as a value.
				//when we hit delete button from all registrations the email will get into url as http://localhost:8080/regapp/delete?email=satish@gmail.com with a 404 error on web page. By this we can perform backend servlet operation to delete registration by email.
				//we will copy the delete and paste it in deleteController to call that servlet
				//But the links cannot call Post method, Links always call Get method of a servlet and in the get mathod we will be reading vaue from URL stored in the attribute email of "delete?email %>
			</tr>
		<%}%>
	</table>
</body>
</html>