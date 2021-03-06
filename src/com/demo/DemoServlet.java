package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	
	String invitationMessage ;
	public void init() {
		invitationMessage ="hi guys please attend my j2ee training with out fail";
	}
	
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>"+invitationMessage+"</h1>");
		
	}

}
