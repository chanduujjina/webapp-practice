package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	int a,b,result;
	
	public void init() {
		a=10;
		b=20;
		result = a+b;
	}
	
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer =response.getWriter();
		writer.println("<h1>"+result+"</h1>");
		
	}

}
