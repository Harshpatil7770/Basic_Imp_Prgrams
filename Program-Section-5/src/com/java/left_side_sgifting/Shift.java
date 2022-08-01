package com.java.left_side_sgifting;

public class Shift {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		// 2,3,4,5,1

		int temp = a[0];
		int n = 1;
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + n];
		}

		a[a.length - 1] = temp;
		for (int ele : a) {
			System.out.print(ele + " ");
		}
	}
}
