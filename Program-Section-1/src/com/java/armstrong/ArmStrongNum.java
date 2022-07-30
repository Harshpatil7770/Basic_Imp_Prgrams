package com.java.armstrong;

import java.util.*;

public class ArmStrongNum {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any number :: ");
		int num = sc.nextInt();
		int tem=num;
		int rem, rev = 0;
		while (tem != 0) {
			rem = tem % 10;
			rev = rev + (rem * rem * rem);
			tem = tem / 10;
		}
		if (rev == num)
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not a Armstrong number ");
	}
}
