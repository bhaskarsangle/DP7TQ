package com.merge;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 11, 12, 13, 14 };
		System.out.println("CompleteMerge.........");
		System.out.println(Arrays.toString(completeMerge(arr1, arr2)));
		System.out.println("AlternateMerge.........");
		System.out.println(Arrays.toString(alternateMerge(arr1, arr2)));
		System.out.println("AlternateMerge skip.........");
		System.out.println(Arrays.toString(alternateMergeSkip(arr1, arr2)));

	}

	static int[] completeMerge(int[] a1, int[] a2) {
		int mer[] = new int[a1.length + a2.length];
		int index = 0;
		for (int i = 0; i < a1.length; i++) {
			mer[index++] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			mer[index++] = a2[i];
		}
		return mer;
	}

	static int[] alternateMerge(int[] a1, int[] a2) {
		int mer[] = new int[a1.length + a2.length];
		int index = 0;
		int maxLength = Math.max(a1.length, a2.length);
		for (int i = 0; i < maxLength; i++) {
			if (i < a1.length) {
				mer[index++] = a1[i];
			}
			if (i < a2.length) {
				mer[index++] = a2[i];
			}

		}

		return mer;
	}

	static int[] alternateMergeSkip(int[] a1, int[] a2) {
		int maxLength = Math.max(a1.length, a2.length);
		int mer[] = new int[maxLength];
		int i = 0;
		int index = 0;
		while (index < maxLength) {
			if (i < a1.length) {
				mer[index++] = a1[i];
				i++;
			}
			if (i < a2.length) {
				mer[index++] = a2[i];
				i++;
			}
		}

		return mer;
	}

}
