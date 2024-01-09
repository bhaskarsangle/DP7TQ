package com.statickeyword;

public class Student1 {
	private int id;
	String name;
	static String scName;

	Student1() {
		scName = "st joseph";
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

	public static String getScName() {
		return scName;
	}

	public static void setScName(String scName) {
		Student1.scName = scName;
	}

	public Student1(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
 		Student1 st = new Student1();
		System.out.println(st.name);
		Student1 st1 = new Student1();
		System.out.println(st1.name);
	}

}
