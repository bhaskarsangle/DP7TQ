package com.intermidate;

public class SumofPrimeNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 3, 4, 11, 12 };
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if (checkPrime(arr[i])) {
               sum=sum+arr[i];
			}
		}
		System.out.println("sum of prime number from arrays is :"+sum);
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
