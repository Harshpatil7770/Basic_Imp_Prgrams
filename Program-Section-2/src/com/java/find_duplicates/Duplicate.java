package com.java.find_duplicates;

public class Duplicate {

	public static void main(String[] args) {
		char a[] = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(a[i]);
			}
		}
	}
}
