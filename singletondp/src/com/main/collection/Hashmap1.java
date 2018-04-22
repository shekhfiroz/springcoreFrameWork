package com.main.collection;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {

	public void hash() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("1", "shekh");
		hm.put("2", "firoz");
		hm.put("3", "alam");
		hm.put("4", "java");

		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println(key);

		}
		/*
		 * System.out.println(hm); System.out.println(hm.keySet());
		 * System.out.println(hm.isEmpty()); System.out.println("Value of 1: " +
		 * hm.get("1")); System.out.println("Value of 2: " + hm.get("2"));
		 * System.out.println("Value of 3: " + hm.get("3"));
		 */
	}

	public static void main(String[] args) {
		Hashmap1 hm = new Hashmap1();
		hm.hash();
	}
}
