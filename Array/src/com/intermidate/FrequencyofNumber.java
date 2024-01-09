package com.intermidate;

public class FrequencyofNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1, 3, 9, 2, 1, 7 };
		calFreq(arr);
	}

	static void calFreq(int[] ar) {
		int count;
		boolean status;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			status = false;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					status = true;
					break;
				}
			}
			if (status == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}
				}
				System.out.println(ar[i] + "    " + count);
//	duplicate		
//				if (count>1) {
//					System.out.println(ar[i]+" "+count);
//				}
//	unique
//				if (count==1) {
//					System.out.println(ar[i]);
//
//				}
			}
		}
	}

}
