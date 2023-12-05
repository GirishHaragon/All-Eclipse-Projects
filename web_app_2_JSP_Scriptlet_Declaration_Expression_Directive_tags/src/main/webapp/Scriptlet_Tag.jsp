<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Example</title>
</head>
<body>
	<h2>Scriptlet Tag Exmaple</h2>
		<%
			System.out.println(100);
		%>
		<%
			for(int i=0;i<10;i++){
				System.out.println(i);
			}
		%>
			<h4>Implicit Objects</h4>
		<%
			for(int i=0;i<10;i++){
				out.println(i);//We need not write response.getWriter() to print something on web page. Where 'out' is the Implicit object.
			}
			request.setAttribute("val", 100);//'request' is another Implicit object in Scriptlet tag.
			out.println(request.getAttribute("val"));
			session.setAttribute("Value", 110);
			System.out.println(session.getAttribute("Value"));
			//We have generally 4 implicit objects in Scriptlet tag -> out, request, session, response
		%>
		<%//We cannot use Access specifiers in Scrriptlet tag.
			//public int x = 10;//Shows error on x.
			
		  //Scriptlet tag doesn't support Html code inside it.
		  	//<h2>Hi..</h2>//Shows error.
		  
		  //Scriptlet tag doesn't support Method creation inside it.
		  	//public void test(){  //Shows error on test().
		  	//}
		  	//public int test(){
			//	return 100;		  		
		  	//}
		%>
</body>
</html>