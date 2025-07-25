package com.test;
import java.util.Scanner;

public class Swap {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println( "Before swaping the value a:" + a + " " + "b:" + b);
		
		
		int temp = a;
		a= b;
		b= temp;
		System.out.println("After swaping a:" + a + " " + "b:" + b);
		
		sc.close();
	}

}
