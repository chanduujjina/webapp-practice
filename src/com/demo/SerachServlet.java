package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SerachServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		
		response.sendRedirect("https://www.google.co.in/#q="+name);
	}

}
