package com.operatorProgram;

public class Casting {

	public static void main(String[] args) {

		byte num1 = 78;
		byte num2 = 80;
		byte sum =  (byte) (num1 + num2);
		System.out.println(sum);

		short r1 = 23;
		short r2 = 30;
		short res =  (short) (r1 + r2);
		System.out.println(res);

		float t1 = 78.09f;
		float t2 = (float) 90.08;

		int total = (int) (t1 + t2);
		double sub = t1 - t2;
		System.out.println(total);
		System.out.println(sub);

	}

}
