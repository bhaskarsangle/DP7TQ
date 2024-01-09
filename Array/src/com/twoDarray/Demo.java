package com.twoDarray;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
         int arr[][]=new int[2][3];
         Scanner sc=new Scanner(System.in);
         
         for (int i = 0; i <2; i++) {
			for (int j = 0; j <3; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
         System.out.println("================");
         for (int i = 0; i <2; i++) {
			for (int j : arr[i]) {
				System.out.println(j+" ");
			}
		}
         System.out.println("=======================");
       int ar[][]= {{1,2,3},{4,5,6,},{7,8,9}}  ;
       for (int i = 0; i <ar.length; i++) {
			for (int j : ar[i]) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}

}
