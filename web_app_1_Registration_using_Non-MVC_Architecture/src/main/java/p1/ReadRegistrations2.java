package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read2")
public class ReadRegistrations2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReadRegistrations2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();//By using response.getWriter method we can write any thing on the web page/html 
		out.println("Hello");//By this we r writing something back to HTML web page. 
		//And we can also write HTML code in this..
		out.println("name <input type='text'/>");//Many times when we do this it will not take the text as HTML field. It will print it as it is on the web page.
		//So we need to add one extra line,
		response.setContentType("text/html");
		out.println("name <input type='text'/>");
		//Now if we want to build a table and print the data 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
