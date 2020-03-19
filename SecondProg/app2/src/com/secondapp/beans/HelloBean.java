package com.secondapp.beans;

public class HelloBean {
	
	private String name;
	public static int x;
	HelloBean(){
		x++;
		System.out.println("Object created.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		
		return "Hello "+name;
	}

}
