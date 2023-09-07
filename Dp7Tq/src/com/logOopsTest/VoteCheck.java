package com.logOopsTest;

import java.util.Scanner;
class Person{
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class VoteCheck {
	
	static void checkAge(Person p) {
		if (p.getAge()>18) {
			System.out.println(p.getName()+" is eligible for vote....");
		} else {
			System.out.println(p.getName()+" your not eligible for vote....");
 
		}
	}

	public static void main(String[] args) {
		 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter First Person details..........");
			System.out.println("Enter id...");
			int id = sc.nextInt();
			System.out.println("Enter name...");
			String name = sc.next();
			System.out.println("Enter age...");
			int age = sc.nextInt();
			
			
			System.out.println("Enter Second Person details..........");
			System.out.println("Enter id...");
			int id1 = sc.nextInt();
			System.out.println("Enter name...");
			String name1 = sc.next();
			System.out.println("Enter age...");
			int age1 = sc.nextInt();
			
			
		
		Person per=new Person();
		per.setId(id);
		per.setName(name);
		per.setAge(age);
		
		Person per2=new Person();
		per2.setId(id1);
		per2.setName(name1);
		per2.setAge(age1);
		
		System.out.println(per);
		System.out.println(per2);
		
		 checkAge(per);
		 checkAge(per2);
		 
		 sc.close();

	}

}
