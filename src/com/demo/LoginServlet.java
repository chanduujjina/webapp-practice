package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String firstName = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String successMessage ="success";
		if(firstName.equalsIgnoreCase("chandu") && last_name.equals("ujjina")) {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<h1>"+successMessage+"</h1>");
		}
	}

}
