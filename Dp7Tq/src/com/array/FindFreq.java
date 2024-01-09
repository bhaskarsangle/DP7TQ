package com.array;

import java.util.Arrays;

public class FindFreq {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 2, 4, 1, 3, 4 };
		int count;
		boolean visit;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			visit = false;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					visit = true;
					break;
				}
			}
			if (visit == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}

				System.out.println(ar[i] + "---->" + count);
			}
		}
		System.out.println(Arrays.toString(ar));

	}

	 

}
