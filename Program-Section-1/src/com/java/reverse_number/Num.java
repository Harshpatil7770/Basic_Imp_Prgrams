package com.java.reverse_number;

public class Num {

	public static void main(String[] args) {
		int num = 153;

		int rem, rev = 0;
		while (num != 0) {
			rem = num % 10; // 153 modulus 10 =15.3 remainder 3
			rev = (rev * 10) + rem;
			num = num / 10; // 153 dividing 10 =15.3 quotient =15
		}

		System.out.println(rev);
	}
}
