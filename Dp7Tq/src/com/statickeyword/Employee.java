package com.statickeyword;

public class Employee {

	private int id;
	private String name;
	private static String company;
	
	
	static {
         company="Walstar";
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


	public static String getCompany() {
		return company;
	}


	public static void setCompany(String company) {
		Employee.company = company;
	}


	public Employee() {
		
 	}


	public Employee(int id, String name) {
 		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return  id + " " + name + " "+company;
	}


	public static void changeName(String cName) {
 		company=cName;
	}

	 
	

	 

}
