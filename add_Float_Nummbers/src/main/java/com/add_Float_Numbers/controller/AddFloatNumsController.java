package com.add_Float_Numbers.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.add_Float_Numbers.model.*;

@WebServlet("/add")
public class AddFloatNumsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddFloatNumsController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Trying with float (decimal) addition of numbers.
		float num3 = Float.parseFloat(request.getParameter("num3"));
		float num4 = Float.parseFloat(request.getParameter("num4"));
		
		AddNFloatNumbers decimals = new AddNFloatNumbers();
		float addDecimals = decimals.addNumbers(num3, num4);
		
		request.setAttribute("resu", addDecimals);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("add_FloatNumbers.jsp");
		rd1.forward(request, response);
	}

}
