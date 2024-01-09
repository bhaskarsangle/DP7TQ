package com.mergearray;

import java.util.Arrays;

public class AlternateMerge {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 12, 13 };
		int merge[] = mergeArr(arr1, arr2);
		System.out.println(Arrays.toString(merge));
	}

	static int[] mergeArr(int[] ar1, int[] ar2) {
		int index = 0;
		int mar[] = new int[ar1.length + ar2.length];
		int maxlength = Math.max(ar1.length, ar2.length);
		for (int i = 0; i < maxlength; i++) {
			if (i < ar2.length) {
				mar[index] = ar2[i];
				index++;
			}

			if (i < ar1.length) {
				mar[index] = ar1[i];
				index++;
			}

		}
		return mar;
	}

}
