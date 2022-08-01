package com.java.prime_num;

public class PrimeNum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] % a[j] == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println("The prime num:: " + a[i]);
			}
		}

	}
}
