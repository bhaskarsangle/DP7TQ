package com.basics;

import java.util.Arrays;

public class PassArray {
	public static void squareElements(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= ar[i]*ar[i];
		}
	}
	public static void squareElements1(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= ar[i]*ar[i];
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		
		squareElements(arr);
		squareElements1(arr);

		System.out.println(Arrays.toString(arr));
		
	}
}
