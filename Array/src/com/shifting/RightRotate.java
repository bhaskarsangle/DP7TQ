package com.shifting;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7, 9, 5,6 };
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	}

	  static void rotate(int[] ar) {
		  int lastElement=ar[ar.length-1];
 		for (int i =ar.length-1; i>0; i--) {
			ar[i]=ar[i-1];
		}
 		ar[0]=lastElement;
	}

}
