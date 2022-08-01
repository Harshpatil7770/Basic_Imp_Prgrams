package com.java.duplicate;

public class DuplicateNum {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 2, 5, 4, 5, 1, 2 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					//if we got again matching number make it as 0
					a[j] = 0;
				}
			}
			if (count > 0 && a[i] != 0) {
				System.out.println(a[i]);
			}
		}
	}
}

//1==1
//count= 1;
//a[3]=0
//1,2,3,0,2,5,4,5,1,2
//count=2;
//

