package com.bridgelabz.hashtable;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class HashMapTest {

	@Test
	void testUC1() {
		String sequence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

		String[] words = sequence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);

			if (value == null)
				value = 1;
			else
				value += 1;

			myHashMap.add(word, value);
		}

		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);

	}

	@Test
	void testUC2() {
		String sequence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();

		String[] words = sequence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);

			if (value == null)
				value = 1;
			else
				value += 1;

			myLinkedHashMap.add(word, value);
		}

		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);

	}

}
