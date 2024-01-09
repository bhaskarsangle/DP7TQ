package com.shifting;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 3, 4, 9, 6 };
		System.out.println(Arrays.toString(arr));
		System.out.println("after sorting array.....");
		ascAr(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("-------Desc-----");
		descAr(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void ascAr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	static void descAr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
