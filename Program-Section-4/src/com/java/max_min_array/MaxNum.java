package com.java.max_min_array;

public class MaxNum {

	public static void main(String[] args) {
		int a[] = { 3, 14, 34, 3, 32, 52, 5, 25, 245, 42, 542, 5 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("The max number is ::" + max);
	}
}
