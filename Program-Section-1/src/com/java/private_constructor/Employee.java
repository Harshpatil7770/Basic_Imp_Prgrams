package com.java.private_constructor;

public class Employee {

	private static int id;

	private static String name;

	static Employee employee = new Employee();

	private Employee() {
		this.id = id;
		this.name = name;
	}

	public static Employee getId() {
		return employee;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static Employee getName() {
		return employee;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Test {

	static Employee employee;

	public static void main(String[] args) {

		Employee employee = Employee.getId();
		Employee employee1 = Employee.getName();
	
		System.out.println(employee == employee1);
	}
}
