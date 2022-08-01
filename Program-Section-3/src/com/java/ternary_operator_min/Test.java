package com.java.ternary_operator_min;

public class Test {

	public static void main(String[] args) {
		int a = 20, b = 19, c = 20;

		int temp = a < b ? a : b;
		int min = c < temp ? c : temp;

		System.out.println("The min " + min);

	}
}
