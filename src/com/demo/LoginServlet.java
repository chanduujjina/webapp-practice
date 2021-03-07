package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

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
		else {
			PrintWriter writer = response.getWriter();
			writer.print("incorreect username or password");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
	}
	
	private boolean validateCredentails(String userName , String password) {
		if(getUserNameList().contains(userName) && getUserPassWordList().contains(password)) {
			return true;
		}
		return false;
	}
	
	private List<String> getUserNameList(){
		return Arrays.asList("Chandu","Pavan","Vinod");
		
	}
	
	private List<String> getUserPassWordList(){
		return Arrays.asList("Chandu","Pavan","Vinod");
		
	}

}
