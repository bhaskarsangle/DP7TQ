package com.logOopsTest;
class StudentDetails{
	private int id;
	private String name;
	private String course;
	private double marks;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	
	
	
}

public class Student {

	public static void main(String[] args) {
        StudentDetails stu=new StudentDetails();
        stu.setId(121);
        stu.setName("bhaskar");
        stu.setCourse("java");
        stu.setMarks(120.30);
        
        StudentDetails stu2=new StudentDetails();
        stu2.setId(122);
        stu2.setName("kiran");
        stu2.setCourse("python");
        stu2.setMarks(122.70);
        
        StudentDetails stu3=new StudentDetails();
        stu3.setId(122);
        stu3.setName("ravi");
        stu3.setCourse("webtech");
        stu3.setMarks(125.50);
        
        
        System.out.println(stu);
        System.out.println(stu2);
        System.out.println(stu3);

	}

}
