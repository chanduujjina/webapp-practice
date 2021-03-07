package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Employee;

public class EmployeeDetailService {
	
	private static List<Employee> employeeList = new ArrayList();
	
	static {
		employeeList.add(new Employee(1, "chandu", "it", 100000));
		employeeList.add(new Employee(2, "siva", "it", 50000));
		employeeList.add(new Employee(3, "balu", "it", 300000));
		employeeList.add(new Employee(4, "pavan", "HR", 100000));
		employeeList.add(new Employee(5, "vinod", "Admin", 100000));
	}

	
	public static List<Employee> getEmployeeList(){
		return employeeList;
	}
}
