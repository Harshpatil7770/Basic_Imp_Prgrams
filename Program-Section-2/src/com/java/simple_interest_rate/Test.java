package com.java.simple_interest_rate;

import java.util.*;

public class Test {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter how much amount how you taken ? ");
		double amount = sc.nextDouble();
		System.out.println("You have entered the amount is :: " + amount);
		System.out.println("Enter how much year you required to pay back ?");
		float year = sc.nextFloat();
		System.out.println("You have entered the year  is :: " + year);
		System.out.println("The interest rate as per the company policy is :: 11%");
		double totalAmount = amount + ((amount * 3) / (year * 100));
		System.out.println("Total amount you need to pay after the year is :: " + totalAmount + amount);
	}
}
