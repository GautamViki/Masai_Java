package com.java111.Day4;

public class JavaBeansDemo {
	public static void main(String[] args) {
		JavaBeansQuest1 jv=new JavaBeansQuest1();
		jv.setName("Rajesh");
		jv.setRoll(157);
		jv.setAge(2);
		jv.setMarks(350);
		
		jv.showDetails();
		
		System.out.println();
		JavaBeansQuest1 jv1=new JavaBeansQuest1(124,"Vikas",245,24);
		jv1.showDetails();
	}
}
