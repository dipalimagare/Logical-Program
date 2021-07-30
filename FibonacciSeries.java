package com.bridgelabz;

import java.util.Scanner;

//In fibonacci series, next number is the sum of previous two numbers 

public class FibonacciSeries {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int count = sc.nextInt();
		sc.close();
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibonacci(count - 2);// n-2 because 2 numbers are already printed
	}

}
