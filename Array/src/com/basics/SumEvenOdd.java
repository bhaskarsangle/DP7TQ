package com.basics;

public class SumEvenOdd {

	public static void main(String[] args) {
          int arr[]={2,4,6,3,9,1};
          System.out.println("Sum of even Number :"+sumOfEven(arr));
          System.out.println("Sum of odd Number :"+sumOfOdd(arr));

	}

	  static int sumOfOdd(int[] ar) {
          int sEven=0;
          for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2!=0)
        	  sEven=sEven+ar[i];
		}
		
		
		return sEven;
	}

	  static int sumOfEven(int[] ar) {
		int sOdd=0;
        for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0)
      	  sOdd=sOdd+ar[i];
		}
		
		
		return sOdd;
	}

}
