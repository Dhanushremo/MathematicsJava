package com.dhanush.dsa.java;

import java.util.Scanner;

public class TrailingZeros {
	
	static int trailZeros(int n) {
		int count=0;
		int powOf5=5;
		while(n>=powOf5) {
			count=n/powOf5;
			powOf5*=powOf5;
		}
		return count;
	}
	public static void main(String[] args) {
	System.out.println("Enter the Number");
	int num=new Scanner(System.in).nextInt();
	System.out.println("The No.of TrailingZero's are "+trailZeros(num));
		
	}

}
