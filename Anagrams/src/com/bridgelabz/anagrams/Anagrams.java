package com.bridgelabz.anagrams;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String word1 = "earth";
		String word2 = "heart";
		boolean isAnagram = checkAnagram(word1, word2);
		System.out.println(isAnagram);

	}

	private static boolean checkAnagram(String word1, String word2) {

		char[] word1Arr = word1.toCharArray();
		char[] word2Arr = word2.toCharArray();
		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);
		if (new String(word1Arr).equals(new String(word2Arr)))
			return true;
		else
			return false;
	}
}
