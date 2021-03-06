package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(validateCredentails(userName,password)) {
			RequestDispatcher rd = request.getRequestDispatcher("welcome1");
			rd.forward(request, response);
			
		}
	}
	
	private boolean validateCredentails(String userName , String password) {
		if(userName.equalsIgnoreCase("chandu") && password.equalsIgnoreCase("chandu")) {
			return true;
		}
		return false;
	}

}
