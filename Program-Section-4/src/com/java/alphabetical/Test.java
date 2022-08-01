package com.java.alphabetical;

public class Test {

	public static void main(String[] args) {
		String str[] = { "ram", "Roy", "Sahil", "Smiht", "jack", "Jonh" };

		for (int i = 0; i < str.length; i++) {
			String temp = "";
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].toLowerCase().compareTo(str[j].toLowerCase()) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.print(str[i] + ",");
		}

	}
}
