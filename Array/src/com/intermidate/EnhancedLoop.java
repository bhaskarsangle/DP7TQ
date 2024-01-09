package com.intermidate;

public class EnhancedLoop {

	public static void main(String[] args) {
     int arr[]= {2,3,1,6,4};
     for (int i : arr) {
		System.out.println(i);
	}
     System.out.println("=======");
     //cannot update
     //no access to index
     for (int i : arr) {
             i=i*i*i;
      }
     for (int i : arr) {
 		System.out.println(i);
 	}
	}

}
