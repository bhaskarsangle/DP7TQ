package com.array;

public class FreqElementChar {

	public static void main(String[] args) {
      char arr[]= {'a','b','a','c','b','a'};
      freqEle(arr);
	}

	static void freqEle(char [] ar) {
		int count;
		for (int i = 0; i < ar.length; i++) {
			 count=1;
			 if (ar[i]=='\0') {
				continue;
			}
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]==ar[j]) {
					count ++;
					ar[j]='\0';
				}
			}
			System.out.println(ar[i]+" ----> "+count);
 		}
		 
	}

}
