package com.mergearray;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 12, 13 };
		int merge[] = mergeArr(arr1, arr2);
		System.out.println(Arrays.toString(merge));
	}

	static int[] mergeArr(int ar1[], int ar2[]) {
		int mer[] = new int[ar1.length + ar2.length];
		int i = 0;
		for (int j = 0; j < ar1.length; j++) {
			mer[i] = ar1[j];
			i++;
		}
		for (int k = 0; k < ar2.length; k++) {
			mer[i] = ar2[k];
			i++;
		}
		return mer;
	}

}
