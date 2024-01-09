package com.shifting;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 9, 5,6 };
		for (int i = 0; i <5; i++) {
			rotate(arr);
		}
		
 		System.out.println(Arrays.toString(arr));
	}
	 static void rotate(int[] ar) {
		 int firstElement=ar[0];
		 for (int i = 0; i < ar.length-1; i++) {
			ar[i]=ar[i+1];
		}
		 ar[ar.length-1]=firstElement;
	}
}
