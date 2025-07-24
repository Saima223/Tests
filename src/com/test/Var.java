package com.test;
/*What is the difference between 
 * a local variable, instance variable, and static variable in Java?*/

public class Var {
	static int c = 30;
	int a = 10;
	public static void main(String[] args) {
		Var obj = new Var();
		int b = 22;
		System.out.println(obj.a + " " + b + " " + " " + Var.c);
	}

}
