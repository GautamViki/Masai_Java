package com.java111.Day4;
public class Demo256 {
	Demo256(){
		System.out.println("Default constructor");
	}
	Demo256(String s){
		System.out.println("String parameterised constructor");
	}
	Demo256(int i){
		System.out.println("Integer parameterised constructor");
	}
	Demo256(float f){
		System.out.println("Float parameterised constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo256 d1=new Demo256(5878);
	}

}
