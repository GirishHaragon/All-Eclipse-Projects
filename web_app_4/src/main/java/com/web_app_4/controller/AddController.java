package com.web_app_4.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_4.model.AddNumbers;
@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));//getParameter will read it as a string .'. surround it with Integer.parseInt() bcs it will convert string into integer.
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		AddNumbers a = new AddNumbers(); //Model
		int result = a.addNumbers(num1, num2);
		
		request.setAttribute("res", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("add_numbers.jsp");
		rd.forward(request, response);
		}

}
