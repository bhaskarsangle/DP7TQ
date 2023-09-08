package com.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int no = 1;

		for (int i = 1; i <= 3; i++) {
			no = 1;
			for (int j = 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {

				System.out.print(no);
				no++;
			}
			
			for (int l = 0; l < i; l++) {

				 for (int j = 0; j < args.length; j++) {
					
				}
				

			}
			System.out.println();
		}
	}

}
