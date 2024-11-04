package com.dhanush.dsa.java;

import java.util.Scanner;

public class CountNoOfDigits {
	static int countDigits(int n) {
		int count=0;
		while(n!=0) {
			n/=10; //removing the last digit
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num=new Scanner(System.in).nextInt();
		System.out.println("No.of Digits in the givve number "+num+"="+countDigits(num));
	}

}
