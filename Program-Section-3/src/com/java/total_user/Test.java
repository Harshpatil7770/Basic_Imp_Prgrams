package com.java.total_user;

import java.util.*;

public class Test {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter how much number do you want to enter?");
		int count = sc.nextInt();

		System.out.println("Enter one by one: ");
		int num[] = new int[count];

		for (int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
		}

		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}
		System.out.println("total is :: " + total);
	}
}
