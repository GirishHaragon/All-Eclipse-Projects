package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecondServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Second Srvlet Get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getAttribute("val");
		System.out.println(name);//Using RequestDispatcher Printing Stallin once
		
		HttpSession session = request.getSession();
		String sessionVal = (String) session.getAttribute("sessionVal");
		System.out.println(sessionVal);//Using session.setAttribute Printing Stallin Twice
	}
}
