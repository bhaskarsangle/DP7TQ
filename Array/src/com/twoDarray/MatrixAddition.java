package com.twoDarray;

public class MatrixAddition {
	static int[][] add(int a1[][], int a2[][]) {
		int rows = a1.length;
		int col = a1[0].length;
		int mar[][] = new int[rows][col];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				mar[i][j] = a1[i][j] + a2[i][j];
			}
		}
		return mar;
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
		int arr1[][] = { { 2, 1 }, { 4, 6 } };
		int arr2[][] = { { 3, 1 }, { 2, 1 } };
		display(arr1);
		display(arr2);
		int result[][] = add(arr1, arr2);
		display(result);

	}

}
