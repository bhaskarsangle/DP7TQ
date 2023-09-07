package com.loopassign;

public class ProductOfDigit {

	public static void main(String[] args) {
         int no=42313;
         int product=1;
         while (no>0) {
			int rem=no%10;
			product=product*rem;
			no=no/10;
		}
         System.out.println(product);
	}

}
