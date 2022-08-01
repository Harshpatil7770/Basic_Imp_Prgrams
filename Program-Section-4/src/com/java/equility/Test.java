package com.java.equility;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = { 9, 8, 4, 5, 7, 6, 2, 1, 6, };

		int count = 0;
		if (a.length == b.length) {

			Arrays.sort(a);
			Arrays.sort(b);
			for (int i = 0; i < a.length; i++) {
				for (int j = i; j <= i; j++) {
					if (a[i] == b[j]) {
						count = 0;
					} else {
						System.out.println("Two Arrays are not equal");
						break;
					}
				}
			}

		} else {
			count = 1;
		}
		if (count == 0) {
			System.out.println("Two Arrays are equal");
		} else {
			System.out.println("Two Arrays are not equal");
		}
	}
}
