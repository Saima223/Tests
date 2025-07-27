package com.centre;

public class LeapYear {
	public static void main (String[] args) {
		int year = 2025;
		if(year % 4 ==0 && year % 100 != 0) { //both must be true 
			System.out.println(year + " is leap year ");
		}else {
			System.out.println(year + " is NOT a leap year");
		}
	}
}
