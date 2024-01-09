package com.basics;

public class ProductSum {

	public static void main(String[] args) {
       int arr[]= {10,20,1,8};
       System.out.println("Product :"+product(arr));
	}

	  static int product(int[] ar) {
		  int pro=1;
		  for (int i = 0; i < ar.length; i++) {
			pro=pro*ar[i];
		}
		  
		  
 		return pro;
	}

}
