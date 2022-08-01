package com.java.print_not_double;

public class Test {

	public static void main(String[] args) {
		String str = "abcabcg";
		char a[] = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			char temp;
			int n = 0;
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = '0';
				}
			}
			if (count == 0 && a[i] != '0')
				System.out.print(a[i] + "");
		}
	}

}
