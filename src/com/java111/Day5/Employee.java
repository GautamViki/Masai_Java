package com.java111.Day5;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	 public void calculateNetSalary(int pfPercentage) {
		 double _netSal=this.salary*pfPercentage/100;
		 this.netSalary=this.salary-_netSal;
	 }
	 public void getEmployeeDetails() {
		 System.out.println("ID : "+employeeId);
		 System.out.println("Name : "+employeeName);
		 System.out.println("Salary : "+salary);
		 System.out.println("Net Salary : "+netSalary);
	 }


    public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
