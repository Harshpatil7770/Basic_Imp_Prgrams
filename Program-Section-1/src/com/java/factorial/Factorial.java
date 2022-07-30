package com.java.factorial;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;

		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i; // 1*1=1
			// =1*2=2
			// 2*3=6
			// 6*4=24
			// 24*5=120
		}
		System.out.println(result);
	}
}
