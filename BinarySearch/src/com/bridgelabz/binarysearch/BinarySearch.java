package com.bridgelabz.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	static boolean result = false;

	public static void main(String[] args) throws IOException {
		Class clazz = BinarySearch.class;
		InputStream inputStream = clazz.getResourceAsStream("/WordList.csv");
		String data = readFromInputStream(inputStream);

		String[] wordArray = data.toLowerCase().split(",");
		System.out.print("Data from the file: ");
		for (String word : wordArray) {
			System.out.print(word + " | ");
		}
		System.out.println();
		System.out.print("Enter the word to search:");

		Scanner scan = new Scanner(System.in);

		String searchWord = scan.next();
		searchWord = searchWord.toLowerCase();
		boolean found = binarySearch(wordArray, searchWord, 0, wordArray.length);

		if (found) {
			System.out.println(searchWord + " is found");
		} else {
			System.out.println(searchWord + " is NOT found");
		}
	}

	private static boolean binarySearch(String[] wordArray, String searchWord, int low, int high) {

		Arrays.sort(wordArray);

		if (low > high) {
			return false;
		}

		int mid = low + (high - low) / 2;

		if (searchWord.equals(wordArray[mid])) {
			result = true;
		} else if (searchWord.compareTo(wordArray[mid]) < 0) {
			binarySearch(wordArray, searchWord, low, mid - 1);
		} else {
			binarySearch(wordArray, searchWord, mid + 1, high);
		}

		return result;
	}

	private static String readFromInputStream(InputStream inputStream) throws IOException {
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		return resultStringBuilder.toString();
	}
}
