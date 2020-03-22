package com.seventhapp.beans;

public class HelloBean {
	public static int count;
	static {
		System.out.println("Static block of HelloBean");
	}
	
	public HelloBean() {
		count++;
		System.out.println("HelloBean object created.");
	}

	public String sayHello() {
		return "Hello User !!!";
	}
}
