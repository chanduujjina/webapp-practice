package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	int a, b;
	public void init() {
		a =10;
		b=20;
	}
	
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int c= a+b;
		writer.println("<h1>"+c+"</h1>");
		
	}
}
