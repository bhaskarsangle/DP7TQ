package com.shifting;

import java.util.Arrays;

public class HalfSort {

	public static void main(String[] args) {
		int arr[] = { 11, 23, 10, 5, 9, 56, 20, 7 };
		sortHalf(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sortHalf(int[] ar) {
		for (int i = 0; i < ar.length / 2; i++) {
			for (int j = i + 1; j < ar.length / 2; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}

		}
		for (int i = (ar.length / 2); i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

	}

}
