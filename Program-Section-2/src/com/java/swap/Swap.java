package com.java.swap;

public class Swap {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before swap :: a:" + a + " b" + b);

		b = a;
		a = b + b;
		System.out.println("After swap:: a:" + a + " b:" + b);
	}
}
