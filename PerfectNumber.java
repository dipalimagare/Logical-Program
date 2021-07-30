package com.bridgelabz;

//A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
//the sum of factors is equal to the number itself.
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int number, s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = sc.nextInt(); // reads a number from the user
		sc.close();
		
		s = isPerfect(number); // calling the function
		if (s == number) // compares sum with the number
			System.out.println( number + " is a perfect number");
		else
			System.out.println(number + " is not a perfect number");
	}

	static int isPerfect(int num) {

		int sum = 0; // variable stores the sum
		for (int i = 1; i <= num / 2; i++) // executes until the condition becomes false
		{
			if (num % i == 0) 
			{
				sum = sum + i; // calculates the sum of factors
				System.out.println(" " + i + " " ); 
			} 
		}
		return sum; // returns the sum of factors
	}
}
