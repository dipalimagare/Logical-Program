package com.bridgelabz;

import java.util.Scanner;

public class SqrtNewtonMethod {
	public static void sqrt(int c) {
        final double epsilon = 1e-15;
        float t = c;
        
        while(Math.abs(t-c/t) > epsilon * t) {
        	 double lastT = t;  
            t = (float) ((c/t + t)/2); 
            if ( lastT == t) {              // some number gives a same square root repeatedly
                break;                      // so it will break 'while' loop if a number gives a same square root repeatedly
            }
            }
        System.out.println("Square root of " + c + " = " + t);
	}
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the number: ");
		 int c = s.nextInt();
		 s.close();
		 sqrt(c);
}
}