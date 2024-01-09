package com.testdemo;

class Demo1 {
	void display(float sal) {
		double salary = sal + (0.2 * sal);
		System.out.println(salary);

	};
}

class Demo2 extends Demo1 {

	void display(float sal) {
		double salary = sal + (0.3 * sal);
		System.out.println("override method");
		System.out.println(salary);
	}
}

public class Override {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.display(20000);
	}

}
