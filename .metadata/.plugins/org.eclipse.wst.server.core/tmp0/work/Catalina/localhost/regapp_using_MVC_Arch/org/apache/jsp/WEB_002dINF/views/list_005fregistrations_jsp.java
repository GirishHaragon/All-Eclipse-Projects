/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-06-23 02:51:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class list_005fregistrations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/menu.jsp", Long.valueOf(1678690658556L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.ResultSet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<a href=\"saveReg\">New Registration</a>\r\n");
      out.write("	<a href=\"listAll\">All Registration</a>\r\n");
      out.write("	<form action=\"Logout\" method=\"post\">\r\n");
      out.write("		<input type=\"submit\" value=\"Logout\"/>\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>All registrations</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>All Registrations...</h2>\r\n");
      out.write("	<table border='1'>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>Name</th>\r\n");
      out.write("			<th>City</th>\r\n");
      out.write("			<th>Email</th>\r\n");
      out.write("			<th>Mobile</th>\r\n");
      out.write("			<th>Delete</th>\r\n");
      out.write("			<th>Update</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

			ResultSet result = (ResultSet)request.getAttribute("result");//At first ResultSet will show error then we import it using ctrl+space ResultSet-java.sql, but then the request.getAtt will get error bcs this is returning object and we r storing it in ResultSet hence lets do class downcasting
		//bcs the return type of request.getAttribute is object, but we are storing it in ResultSet. When object is converted to ResultSet, it is parent to child class and calls as Class downCasting. Always the supermost class is Object. we can check keeping the cursor on getAttr it'll show the class of it as object. so we need class downCasting there to remove error.
		//All the classes that we create is a child class of Object, if it is returning object we should convert it to required ResultSet Child class
			while(result.next()){ 
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>");
      out.print(result.getString(1) );
//used expression tag here 
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(result.getString(2) );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(result.getString(3) );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(result.getString(4) );
      out.write("</td>\r\n");
      out.write("				<td><a href=\"delete?email=");
      out.print(result.getString(3));
      out.write("\">Delete</a></td>\r\n");
      out.write("				<td><a href=\"update?email=");
      out.print(result.getString(3));
      out.write("&mobile=");
      out.print(result.getString(4));
      out.write("\">Update</a></td>");
//to supply email and mobile both to the backend we use & without any sapces anywhere in the statement and any number of values can be supplied to the backend using &. 
      out.write("\r\n");
      out.write("			");
//the tag used here is called Anchor Tag
				//Earlierly what we did is we developed a form, we submit the form, the servlet reads the data from the form.
				//But now what we r doing is, we will develop a link and we will supply the datas in the links not in the form this is called QuerryParameters
				//Whenever we give QueryParameters the syntaxes we give with a ?, like delete?  and then we give there the attribute name which can be anything like "delete?id=<%=result.getString(3)%//>" here no spaces should be left in ""s or else email string will get space as a value.
				//when we hit delete button from all registrations the email will get into url as http://localhost:8080/regapp/delete?email=satish@gmail.com with a 404 error on web page. By this we can perform backend servlet operation to delete registration by email.
				//we will copy the delete and paste it in deleteController to call that servlet
				//But the links cannot call Post method, Links always call Get method of a servlet and in the get mathod we will be reading vaue from URL stored in the attribute email of "delete?email 
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("		");
}
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
