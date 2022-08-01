package com.java.max_min_array;

public class MinNum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 34, 3, 4324, 32, 523, 5, 25, 3, 5, 325245, 2 };

		int min = a[0];

		for (int i = 1; i < a.length - 1; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("The min number is : " + min);
	}
}
