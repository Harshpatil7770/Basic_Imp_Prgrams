package com.java.string_reverse;

import java.util.Scanner;

public class ReverseString {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String str = "Hello";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reverse of String is :: " + rev);
	}
}
