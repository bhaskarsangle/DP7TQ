package com.shifting;

import java.util.Arrays;

public class ZeroatEnd {

	public static void shiftZeros(int ar[])
	{
		int pos=0;
		for(int i=0;i<ar.length;i++)
		{
		   if(ar[i]!=0)
		   {
			 ar[pos]=ar[i];
			 pos++;
		   }
			   
		}
		
		while(pos<ar.length)
		{
			ar[pos]=0;
			pos++;
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,0,7,0,5,0,4};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("--After shifting------");
		shiftZeros(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
