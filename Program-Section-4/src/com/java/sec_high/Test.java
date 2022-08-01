package com.java.sec_high;

public class Test {

	public static void main(String[] args) {
		int a[] = { 3, 3, 43, 47, 32, 53, 5 };

		int max = a[0];
		int secLarge = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (max != a[i] && secLarge < a[i]) {
				secLarge = a[i];
			}
		}
		System.out.println("The max num is : " + max);
		System.out.println("The max num is : " + secLarge);
	}
}

//3<3 i=0;j=0
//3<43 i=0;j=1
//[3,3,5,47,32,53,43] n=1;

//3<47
//temp=47
//a[3]=53
//a[5]=47
//[3,3,5,53,32,47,43] n=2;
