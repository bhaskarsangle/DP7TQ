package com.loopassign;

public class SumEvenNumber {

	public static void main(String[] args) {
		int no = 100;
		int sum = 0;
		for (int i = 1; i < no; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
	}

}
