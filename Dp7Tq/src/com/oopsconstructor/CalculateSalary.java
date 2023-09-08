package com.oopsconstructor;

 
class Employee {
	int id;
	String name;
	String designation;
	int salary;

	public Employee(int id, String name, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	int getSalary(Employee e) {
		return salary;
	}

}

public class CalculateSalary {
	 
	public static void main(String[] args) {
		Employee emp = new Employee(12, "bhaskar", "hr", 10000);
            
		
		int sal = emp.getSalary(emp);
		System.out.println(emp);
		System.out.println("Salary : "+sal);
		int total = (int) (sal + sal * 0.1);
		System.out.println("Total salary : "+total);
	
	}

}
