package com.java.sum_of_digit;

public class Sum {

	public static void main(String[] args) {
		int a = 304;

		int rem, rev = 0;
		while (a != 0) {
			rem = a % 10;// modules operator means it will consider the remainder
			rev = rev + rem;
			a = a / 10; // divisor consider the quotient
		}
		System.out.println("The sum of all digits" + rev);
	}
}
