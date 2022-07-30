package com.java.frequency_of_character;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		String str = "welcome";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (map.containsKey(a)) {
				map.put(a, map.get(a)+ 1);
			} else {
				map.put(a, 1);
			}
		}
		for (Map.Entry e : map.entrySet()) {
			System.out.println(e);
		}
	}
}
