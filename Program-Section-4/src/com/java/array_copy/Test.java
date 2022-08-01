package com.java.array_copy;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int a[] = { 13, 2, 324, 23, 42, 3, 45, 45, 45 };

		int b[] = Arrays.copyOf(a, a.length);

		for (int ele : a) {
			System.out.print(ele + ",");
		}
		System.out.println();

		for (int ele : b) {
			System.out.print(ele + ",");
		}
	}
}
