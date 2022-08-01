package com.java.addition_of_two;

public class Addition {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1, 1, }, { 2, 3, 5, 1 } }; // 2*4 i*k=i2
		int b[][] = { { 2, 3, 4, 5 }, { 2, 2, 4, -4 } };// 2*4 k*j=4

		int c[][] = new int[2][4];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				c[i][j] += a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
