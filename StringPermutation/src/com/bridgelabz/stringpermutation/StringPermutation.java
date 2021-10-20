package com.bridgelabz.stringpermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutation {
	static List<String> resultList = new ArrayList<>();

	public static void main(String[] args) {
		String s = "cat";
		List<String> permutationRecursively = getStringPermuataiontRecursively(s, "");
		System.out.println(permutationRecursively);

		String[] permutationIterative = getStringPermuataiontIteratively(s);

		System.out.println(Arrays.toString(permutationIterative));

	}

	// Iterative
	public static String[] getStringPermuataiontIteratively(String str) {

		int n = str.length();
		int f = factorial(n);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < f; i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;

			for (int div = n; div >= 1; div--) {
				int q = temp / div;
				int r = temp % div;
				// System.out.print(sb.charAt(r));
				result.append(sb.charAt(r));
				sb.deleteCharAt(r);

				temp = q;
			}
			result.append(",");

		}
		return result.toString().split(",");
	}

	private static int factorial(int n) {
		int val = 1;
		for (int i = 2; i <= n; i++) {
			val *= i;
		}

		return val;
	}

	// Recursive
	static List<String> getStringPermuataiontRecursively(String str, String result) {

		if (str.length() == 0) {
			resultList.add(result);
			return resultList;
		}

		for (int i = 0; i < str.length(); i++) {

			// char at position i
			char ch = str.charAt(i);

			// Rest of string after excluding the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recursive call
			getStringPermuataiontRecursively(ros, result + ch);
		}

		return resultList;
	}

}
