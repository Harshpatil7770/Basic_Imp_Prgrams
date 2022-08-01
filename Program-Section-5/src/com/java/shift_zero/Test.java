package com.java.shift_zero;

public class Test {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 0, -2, -4, -5, 1 };

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]);
		}
	}
}
