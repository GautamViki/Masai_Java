package com.java111.Day4;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		boolean nit =std.getStudent(true);
		Student std1 = new Student(101, "Ramesh", "Lucknow");
		std1.setName("NIT");
		Student std2 = new Student(151, "Rajesh", "Gorakhpur","MMMUT");
		if(nit) {
			std1.showDetails();
		}
		System.out.println();
		std2.showDetails();
		
	}
}
