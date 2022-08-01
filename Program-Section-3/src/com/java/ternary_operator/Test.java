package com.java.ternary_operator;

public class Test {

	public static void main(String[] args) {
		int a = 10, b = 203, c = 20;

		int max;
		int temp = a > b ? a : b;
		max = c > temp ? c : temp;
		System.out.println(max);

	}
}
