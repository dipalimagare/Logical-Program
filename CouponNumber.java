package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many coupons you want to generate : ");
		int numOfCoupon = scanner.nextInt();
		System.out.println("Length of coupon: ");
		int codeLength = scanner.nextInt();
		scanner.close();
		randomCoupon(codeLength);
		randomCoupon1(numOfCoupon);
	}


	public static String randomCoupon(int codeLength){   
	     char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
	        StringBuilder sb = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < codeLength; i++) {
	            char c = chars[random.nextInt(chars.length)];
	            sb.append(c);
	        }
	        String output = sb.toString();
	        System.out.println(output);
	        return output ;
	        
	    }
	public static void randomCoupon1(int numOfCoupon) {
        ArrayList<Integer>couponList = new ArrayList<>();
        int i = 0;
        while (numOfCoupon > i) {
            int randomNumber = (int) Math.floor(Math.random()*1000);
            if (!couponList.contains(randomNumber)) {
                couponList.add(randomNumber);
                i++;
            }
        }
        for (int coupon : couponList) {
            System.out.println(coupon);
        }
	}

}
