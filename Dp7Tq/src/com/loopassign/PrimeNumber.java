package com.loopassign;

public class PrimeNumber {

	public static void main(String[] args) {
         for (int i = 200; i <400; i++) {
			for (int j = 2; j <i; j++) {
				if (i%j!=0) {
				   System.out.println(i);
				}
			}
 		}
	}

}
