<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP - tags</title>
</head>
<body>
	<h2>Expression Tag Example</h2>
	<%!//We r using Declaration tag just to use expression tag.
		public int x = 10;
		public int test(){
			return 100;
		}
		//System.out.println(x);//This is showing error maybe bcz we used implicit object out here
	%>
	<%//We can only write single and small expression related things we can write in Expression tag.
	  //We can't even write comments inside Expression tag.%>
	  <%=x/2*2*1000*(2) %>
	  <%=x+1000 %>
</body>
</html>