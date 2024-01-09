package com.varargs;

public class VarArg {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5};
		int arr1[]= {2,3,4,5,6,10};
       addNumber(2,4);
       addNumber(2,4,5,6);
  	}

	  static void addNumber(int ...ar) {
        int sum=0;
		  
		  for (int i : ar) {
			sum+=i;
		}	
		  System.out.println("Sum : "+sum);
	}

}
