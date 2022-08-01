package com.java.mulitplication;

public class Multiplication {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } }; // i*j=2*3 i*k=2*3
		int b[][] = { { 10, 11 }, { 20, 21 }, { 30, 31 } }; // k*j=3*2

		int c[][] = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
