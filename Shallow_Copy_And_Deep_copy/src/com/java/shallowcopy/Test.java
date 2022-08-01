package com.java.shallowcopy;

public class Test {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		Test t = new Test();
		for (int val : a) {
			System.out.print(val + ",");
		}

		System.out.println("== Shallow Copy ==");
		System.out.println("Create new ref variable that refer to the current instance of class");
		a[0] = 9;

		for (int val : a) {
			System.out.print(val + ",");
		}
	}
}