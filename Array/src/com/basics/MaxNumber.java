package com.basics;

public class MaxNumber {

	public static void main(String[] args) {
       int arr[]= {5,14,23,23,5,7};
       System.out.println("Max Number: "+findMax(arr));
	}

	  static int findMax(int[] ar) {
		  int max=ar[0];
		  for (int i = 0; i < ar.length; i++) {
			if (ar[i]>max) {
				max=ar[i];
			}
		}
		  
 		return max;
	}

}
