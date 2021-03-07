package com.demo.bean;

public class Employee {
	private int id ;
	private String userName;
	private String deptName;
	private int salary;
	
	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getSalary() {
		return salary;
	}

	public Employee(int id, String userName, String deptName, int salary) {
		super();
		this.id = id;
		this.userName = userName;
		this.deptName = deptName;
		this.salary = salary;
	}

	

}
