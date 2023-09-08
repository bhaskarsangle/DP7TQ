package com.loopassign;

public class FactorialSum {

	public static void main(String[] args) {
		
		int sum=0;
 		for (int i = 1; i <=5; i++) {
 			int fact=1;
			for (int j = i; j>=1; j--) {
				fact=fact*j;
			}
			sum=sum+fact;		
		}
 		System.out.println(sum);
	}

}
