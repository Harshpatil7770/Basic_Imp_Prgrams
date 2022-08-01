package com.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee employee = new Employee(66962, "Smith");
		Address address = new Address("101A", "Bhosale galli", "Masale chaudhari");

		FileOutputStream fileOutputStream = new FileOutputStream("emp.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.writeObject(address);

		FileInputStream fileInputStream = new FileInputStream("emp.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Employee employee2 = (Employee) objectInputStream.readObject();
		Address address2 = (Address) objectInputStream.readObject();

		System.out.println(employee2.getId() + " " + employee2.getName() + " " + Employee.getCollegeName() + " "
				+ address2.getCollegeCode() + " " + address2.getHomeNo() + " " + address2.getCityName() + " "
				+ address2.getStreetName());
	}
}