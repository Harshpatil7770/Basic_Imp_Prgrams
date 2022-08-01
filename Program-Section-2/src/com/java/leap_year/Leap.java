package com.java.leap_year;

import java.util.*;

public class Leap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any year");
		int year = sc.nextInt();

		int count = 0;
		if (year % 4 == 0) {

			if (year % 100 != 0) {
				if (year % 400 == 0) {
					count = 1;
				} else {
					count = 0;
				}
			} else {
				count = 0;
			}
		} else {
			count = 1;
		}

		if (count == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}
}
