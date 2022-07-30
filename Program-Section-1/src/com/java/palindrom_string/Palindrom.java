package com.java.palindrom_string;

public class Palindrom {

	public static void main(String[] args) {

		String str = "madam";

		int count = 0;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1-i)) {
				count++;
			}
		}
		if (count == str.length() / 2) {
			System.out.println("Palidrom String");
		} else {
			System.out.println("Not a Palindrom String");
		}
	}
}
