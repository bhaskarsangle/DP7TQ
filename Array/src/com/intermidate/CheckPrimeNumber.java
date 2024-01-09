package com.intermidate;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 3, 4, 11, 12 };
 		for (int i = 0; i < arr.length; i++) {
			if (checkPrime(arr[i])) {
				System.out.println(" prime number from arrays is :"+arr[i]);
			}
		}
		
	}
	static boolean checkPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}

		return true;
	}
}
