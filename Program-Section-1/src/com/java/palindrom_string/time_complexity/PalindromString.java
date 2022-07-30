package com.java.palindrom_string.time_complexity;

public class PalindromString {

	public static void main(String[] args) {
		String str = "hello";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + i);
		}

		System.out.println(str.length());

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
		if (str.equals(rev))
			System.out.println("Palindrom String");
		else {
			System.out.println("Not a Palindrom String ");
		}
	}
}
