package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Employee;
import com.demo.service.EmployeeDetailService;

public class EmployeeInfoServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("name");
		String deptName = request.getParameter("deptName");
		List<Employee> employeeList = EmployeeDetailService.getEmployeeList();
		List<Employee> filteredList = employeeList.stream().filter(emp->emp.getUserName().equalsIgnoreCase(userName) || emp.getDeptName().equalsIgnoreCase(deptName)).collect(Collectors.toList());
		
		PrintWriter writer = response.getWriter();
		filteredList.forEach(employee->{
			writer.println("<h1> userName "+employee.getUserName()+"</h1>");
			writer.println("<h1> deptName "+employee.getDeptName()+"</h1>");
			writer.println("<h1> salry "+employee.getSalary()+"</h1>");
		});
		
		
		}
}
