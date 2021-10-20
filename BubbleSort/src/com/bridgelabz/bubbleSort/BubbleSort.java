package com.bridgelabz.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 89, 78, 53, 19, 834, 9, 567 };

		System.out.print("Original array:");
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr);

		System.out.print("Sorted array:");
		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}
