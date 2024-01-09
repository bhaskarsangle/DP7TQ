package com.basics;

import java.util.Arrays;

public class ArrayDemo1 {

public static void main(String[] args) {
		
		int arr[]= new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------------");
		
		arr[1]=90;
		arr[0]=67;
		arr[2]=78;
		arr[3]=100;
		arr[4]=38;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------");
		
		int arr1[]= {23,45,67,89};
		
		System.out.println(arr1); // prints the hashcode
		System.out.println(Arrays.toString(arr1));
		

		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
