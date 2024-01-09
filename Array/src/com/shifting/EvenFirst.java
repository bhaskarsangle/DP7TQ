package com.shifting;

import java.util.Arrays;

/*WAP to arrange the elements of an given array of integers where all Even integers
appear before all the Odd integers. */
public class EvenFirst {

	public static void main(String[] args) {
         int arr[]= {2,4,3,7,8,11,10,17};
         firstEven(arr);
         System.out.println(Arrays.toString(arr));
	}

	  static void firstEven(int[] ar) {
             for (int i = 0; i < ar.length; i++) {
				if (ar[i]%2==0) {
					continue;
				} else {
					
                      for (int j =ar.length-1; j>=0&&i<j; j--) {
                    	  
						if (ar[j]%2==0) {
							int temp=ar[i];
							ar[i]=ar[j];
							ar[j]=temp;
							break;
						}
					}
				}
			}		
	}

}
