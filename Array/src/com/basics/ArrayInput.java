package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter length of array....");
           int  size=sc.nextInt();
           
           float arr[]=new float[size];
           
           System.out.println("enter elements....");
           for (int i = 0; i < arr.length; i++) {
			      arr[i]=sc.nextFloat();
		}
           System.out.println(Arrays.toString(arr));
           System.out.println("=========+++++++++++=========");
           for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
           sc.close();
	}

}
