package com.java.immutable;

//make class is final so we are not able to inherit it in subclass
public final class Immutable {

	// make member of the class is private and final so once we assing value it we
	// are not able to change it.
	private final int empId;

	private final String empName;

	public Immutable(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	// use only getter method don't use the setter method
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	@Override
	public String toString() {
		return "Immutable [empId=" + empId + ", empName=" + empName + "]";
	}

}
