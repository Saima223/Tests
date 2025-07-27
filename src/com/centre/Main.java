package com.centre;

public class Main {
	Main(){
		this(2);
		System.out.println("constructor is created");
	}
	Main(int a){
		this("Saima");
		System.out.println("It's int type " + a);
	}
	Main(String s){
		System.out.println("It's String" + s);
	}
	public static void main (String[] args) {
	Main m = new Main();
	}

}
