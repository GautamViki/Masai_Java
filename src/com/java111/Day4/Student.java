package com.java111.Day4;

public class Student {
	int roll;
	String name;
	String address;
	String collageName;
	
	public boolean getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			return true;
		}
		else {
			return false;
		}
	}
	public Student() {
	
}
	Student(int roll,String name,String address) {
		// TODO Auto-generated constructor stub
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	public void setName(String collageName){
		this.collageName=collageName;
		}
	Student(int roll,String name,String address,String collageName) {
		// TODO Auto-generated constructor stub
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	public void showDetails(){
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Address is :"+address);
		System.out.println("Collage is :"+collageName);
		}

}
