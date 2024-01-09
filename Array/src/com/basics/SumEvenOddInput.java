package com.basics;

import java.util.Scanner;

public class SumEvenOddInput {

	public static void main(String[] args) {
 
		int arr[]=new int [7];
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter elements......");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of Even Number :"+SumEvenOdd.sumOfEven(arr));
		System.out.println("Sum of odd Number :"+SumEvenOdd.sumOfOdd(arr));

		sc.close();
	}

}
