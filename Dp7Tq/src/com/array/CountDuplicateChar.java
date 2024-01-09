package com.array;

public class CountDuplicateChar {

	public static void main(String[] args) {
		char arr[] = {'a','b','c','a','b','b' };
		checkNumber(arr);

	}

	static void checkNumber(char [] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			if (ar[i] == '\0') {
				continue;
			}
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ar[j] = '\0';
				}
			}
			System.out.println(ar[i] + " ----> " + count);
			if (count==1) {
				System.out.println(ar[i]+" is unique no");
			} else {
	             System.out.println("Duplicate number "+ar[i]);
			}
		}
		

	}

}
