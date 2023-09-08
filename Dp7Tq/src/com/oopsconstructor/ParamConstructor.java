package com.oopsconstructor;

class Student {

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class ParamConstructor {

	public static void main(String[] args) {
		
		//early initialization
		Student s1 = new Student(231, "bhaskar", 24);
		Student s2 = new Student(241, "ram", 25);
		Student s3 = new Student(251, "shree", 27);
		
		Student s4=new Student();//lazy initialization
		s4.setId(261);
		s4.setName("kalu");
		s4.setAge(26);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
 
	}

}
