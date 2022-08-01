package com.java.right_side_shift;

public class Shift {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		// 5,1,2,3,4
		int temp = a[a.length - 1];

		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}

		a[0] = temp;
		for (int ele : a) {
			System.out.print(ele + " ");
		}
	}
}
