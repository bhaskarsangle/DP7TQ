package com.twoDarray;

public class Transpose {
   static int[][] findTranspose(int a1[][]){
	   
	   int col=a1.length;
	   int row=a1[0].length;
	   int tar[][]=new int[row][col];
	   for (int i = 0; i <row; i++) {
		for (int j = 0; j <col; j++) {
			tar[i][j]=a1[j][i];
		}
	}	   
	   	   return tar;
  }
   static void display(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j : a[i]) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("===");

	}
	public static void main(String[] args) {
		int arr1[][] = { { 2, 1,3 }, { 4, 6 ,5}};
		display(arr1);
		int result[][]=findTranspose(arr1);
		display(result);
	}

}
