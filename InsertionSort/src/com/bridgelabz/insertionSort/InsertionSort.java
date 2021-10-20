package com.bridgelabz.insertionSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) throws IOException {
		Class clazz = InsertionSort.class;
		InputStream inputStream = clazz.getResourceAsStream("/WordList.csv");
		String data = readFromInputStream(inputStream);

		String[] wordArray = data.toLowerCase().split(",");
		System.out.print("Data from the file: ");
		System.out.println(Arrays.toString(wordArray));

		System.out.print("Sorted List using Insertion Sort:");
		insertionSort(wordArray);

	}

	private static void insertionSort(String[] wordArray) {
		int i, j;
		String key;
		for (j = 1; j < wordArray.length; j++) {
			key = wordArray[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(wordArray[i]) > 0) {
					break;
				}
				wordArray[i + 1] = wordArray[i];
				i--;
			}
			wordArray[i + 1] = key;
		}
		System.out.println(Arrays.toString(wordArray));
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
