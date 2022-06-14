package com.java111.Day4;

public class JavaBeansQuest1 {
	private int roll;
	private String name;
	private int marks;
	private int age;
	
	public JavaBeansQuest1() {
		// TODO Auto-generated constructor stub
	}
	JavaBeansQuest1(int roll,String name,int marks,int age){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}

	public void setMarks(int marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>18 && age<60) {
			this.age = age;
		}
	}
	void showDetails() {
		System.out.println("Name is : " +name);
		System.out.println("Roll is : "+roll);
		System.out.println("Age is : "+age);
		System.out.println("Marks is : "+marks);
	}
}
