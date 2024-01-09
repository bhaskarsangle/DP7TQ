package com.statickeyword;

public class StaticDemo {

	int x = 10;
	static int y = 10;

	void show() {
		x++;
		System.out.println("X :" + x);
		y++;
		System.out.println("Y : " + y);
	}

	void display() {
		 int y = 20;
		System.out.println("Y: " + y);
		System.out.println("Y: " + StaticDemo.y);
	}

	public static void main(String[] args) {
 		StaticDemo s1 = new StaticDemo();
		System.out.println("object create....");
		s1.show();

		StaticDemo s2 = new StaticDemo();
		System.out.println("object create....");
		s2.show();
		s2.display();

	}

}
