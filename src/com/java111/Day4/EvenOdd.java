package com.java111.Day4;

public class EvenOdd {
	void checkEvenOdd(int num) {
		int rem=num%10;
		
		if(num%2==0 && num>=0) {
			num=num-rem;
			num=num+10;
			System.out.println(num);
		}
		else if(num%2==1) {
			System.out.println(num);
		}
		else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EvenOdd ed=new EvenOdd();
ed.checkEvenOdd(-76);
}

}
