package com.java.singleton;

public class Singleton {

	static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return singleton;
	}
}

class Test {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.hashCode() == s2.hashCode());
	}
}
