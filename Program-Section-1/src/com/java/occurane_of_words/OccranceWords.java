package com.java.occurane_of_words;

import java.util.*;

public class OccranceWords {

	public static void main(String[] args) {
		String str = "hello i am here hey hello are you listening";

		String words[] = str.split("\\s");

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1);
			} else {
				map.put(words[i], 1);
			}
		}

		for (Map.Entry e : map.entrySet()) {
			System.out.println(e);
		}
	}
}
