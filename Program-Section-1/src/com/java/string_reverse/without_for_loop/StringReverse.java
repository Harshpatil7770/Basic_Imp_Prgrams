package com.java.string_reverse.without_for_loop;

public class StringReverse {

	public static String getRevervse(String str) {
		if (str.isEmpty()) {
			return str;
		}

		System.out.print(str.charAt(str.length() - 1));
		return getRevervse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		String str = "hello";
		getRevervse(str);
	}
}
