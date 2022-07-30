package com.java.serilization;

import java.io.Serializable;

public class Employee implements Serializable{

	private int id;

	private String name;

	transient private static String collegeName = "Sangmeshwar college solapur";

	private final String collegeCode = "SCS001";

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Employee.collegeName = collegeName;
	}

	public String getCollegeCode() {
		return collegeCode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", collegeCode=" + collegeCode + "]";
	}

}
