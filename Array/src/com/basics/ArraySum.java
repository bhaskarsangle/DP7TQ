package com.basics;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
        int arr[]= {3,7,8,10,34,23};
        
        System.out.println(Arrays.toString(arr));
        System.out.println("Total Sum: "+findSum(arr));
	}

	  static int findSum(int[] ar) {
		  
		  int sum=0;
		  for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
			
		}
 		return sum;
	}

}
