package com.java.vowel_constant;

import java.util.*;

public class Vowel {

	public static void main(String[] args) {

		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :: ");
		char c = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < vowel.length; i++) {
			if (c == vowel[i]) {
				System.out.println("Entered character is vowel:" + vowel[i]);
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Not a vowel :" + c);
		}
	}

}
