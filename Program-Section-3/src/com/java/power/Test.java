package com.java.power;

import java.util.*;

public class Test {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number :: ");
		int num = sc.nextInt();

		System.out.println("Enter the power of num :: ");
		int power = sc.nextInt();

		int res = 1;
		for (int i = 1; i <= power; i++) {
			res *= num;
		}
		System.out.println(res);
	}
}
