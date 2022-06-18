package com.java111.day16.Question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Employee ");
        int n= sc.nextInt();
        Employee[] employees=new Employee[n];
        TreeSet<Employee>set=new TreeSet<>(new SortBySalary());


        System.out.println();
        for (int i=0;i<employees.length;i++){
            System.out.println("Employee "+(i+1)+" Details");
            System.out.print("Enter Employee Id : ");
            int id= sc.nextInt();
            System.out.print("Enter Employee Name : ");
            String name=sc.next();
            System.out.print("Enter Employee Salary : ");
            double salary= sc.nextDouble();
            employees[i]=new Employee(id,name,salary);
            set.add(employees[i]);
            System.out.println("");
        }
        System.out.println();


        for (Employee e:set){
            System.out.println("Employee Id : "+e.getEmpId());
            System.out.println("Employee Name : "+e.getEmpName());
            System.out.println("Employee Salary : "+e.getSalary());
            System.out.println("========================================");
        }
    }
}
