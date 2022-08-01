package com.java.swap.third;

public class SwapWithThird {

	public static void main(String[] args) {
		int a = 30, b = 49;

		System.out.println("Before Swapping :: a" + a + " b:" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping :: a" + a + " b:" + b);
	}
}
