package com.java.factorial.recursion;

public class RecursionFactorial {

	public static int getFactorial(int a) {
		if (a == 1) {
			return 1;
		}
		return a * getFactorial(a - 1);
	}

	public static void main(String[] args) {
		int a = 5;
		System.out.println("The factorial of entered num is :: " + getFactorial(a));
	}
}
