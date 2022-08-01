package com.java.print_unique;

public class Unique {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 1, 2 };

		// int i[]={4,5,6}

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = 0;
				}
			}
			if (count == 0 && a[i] != 0) {
				System.out.print(a[i] + " ");
			}
		}

	}
}
