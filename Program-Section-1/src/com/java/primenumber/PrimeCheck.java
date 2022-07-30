package com.java.primenumber;

import java.util.*;

public class PrimeCheck {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any number :: ");
		int number = sc.nextInt();

		int count = 0;
		if (number == 0 || number == 1) {
			System.out.println("Not a Prime Number ");
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					System.out.println("Not a Prime Number ");
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("Prime Number");
			}
		}

	}
}
