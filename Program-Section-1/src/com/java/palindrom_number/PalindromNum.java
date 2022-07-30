package com.java.palindrom_number;

import java.util.*;

public class PalindromNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :: ");
		int num = sc.nextInt();
		int temp = num;
		int rem, rev = 0;
		while (temp != 0) {
			rem = temp % 10; // 153%10=15.3 153-150=3 remainder=3
			rev = (rev * 10) + rem; //
			temp = temp / 10; // 153/10= 15.3 quotient 15
		}
		if (rev == num) {
			System.out.println("Palindrom Num");
		} else {
			System.out.println("Not a Palindrom Num");
		}
	}
}
