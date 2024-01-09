package com.shifting;

public class PairSum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 9, 5,6 };
		int sum = 8;
		System.out.println("sum is : "+sum);
		System.out.println("Pairs are : ");

		pairs(arr, sum);
	}

	static void pairs(int[] ar, int sum) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > sum) {
				continue;
			}
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] + ar[j] == sum) {
                   System.out.println("{"+ar[i]+","+ar[j]+"}");
                   break;
				}
			}
		}
	}

}
