package com.dhanush.dsa.java;

import java.util.Scanner;

public class Factorial {
	public static int fact(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int number=scanner.nextInt();
		System.out.println("Factorial of the "+ number+" is "+ fact(number));

	}

}
