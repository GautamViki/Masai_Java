package com.java111.Day5;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id ");
		int id=sc.nextInt();

		System.out.print("Enter name ");
		String name=sc.next();

		System.out.print("Enter salary ");
		double sal=sc.nextDouble();

		System.out.print("Enter PF percentage: ");
		int pf=sc.nextInt();

		Employee emp=new Employee();
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setSalary(sal);
		emp.calculateNetSalary(pf);
		System.out.println();
		emp.getEmployeeDetails();
	}
}



