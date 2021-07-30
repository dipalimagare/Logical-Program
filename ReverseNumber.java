package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	static int ans = 0;

	static int Reverse(int num) {

		// base condition to end the recursive calling of function
		if (num == 0) {
			
			return ans; // We have reversed the complete number and stored in ans variable
		}
		if (num > 0) {

			int temp = num % 10;  // temp variable to store the digit at unit place in the number
			ans = ans * 10 + temp; // Add this temp variable in the ans variable which stores the number reversed till now
			Reverse(num / 10); // recursive calling of function to reverse the remaining number
		}
		return ans; // returning final answer when the number is reversed completely
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		sc.close();

		int rev; // Variable to store reversed number returned by reverse function
		rev = Reverse(num); // Calling reverse function and storing the return value in rev variable
		System.out.println("Reversed number: " + rev); // Printing the Reversed Number
	}

}





//num = 48291
//ans = 0       -> variable to store reversed number
//        
//How this works:    
//    reverse(num)
//          |
//          |__ temp = num % 10    -> extracting unit digit from nnumber
//                ans = ans*10 + temp   -> adding temp at unit position in reversed number 
//          reverse(num/10)    -> calling function for remaining number