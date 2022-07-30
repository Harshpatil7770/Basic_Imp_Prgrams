package com.java.reverse_words;

public class Test {

	public static void main(String[] args) {
		String str = "Hello i am here";

		String rev = "";

		String words[] = str.split("\\s");

		for (int i = words.length - 1; i >= 0; i--) {
			rev = rev + " " + words[i];
		}
		System.out.print(rev);
	}
}
