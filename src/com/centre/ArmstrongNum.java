package com.centre;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();	
		
		if(isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number");
		}else {
			System.out.println(num + " is not an Armstrong number ");
		}
	}
	static boolean isArmstrong(int number) {
		int original = number;
		int count = String.valueOf(number).length();
		int sum = 0;
		
		while (number != 0) {
			int digit = number%10; //
			sum += Math.pow(digit, count); //build-in power function
			number /= 10 ;
		}
		return sum == original;
	}
}
