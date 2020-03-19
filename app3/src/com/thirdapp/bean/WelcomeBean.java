package com.thirdapp.bean;

public class WelcomeBean {
	
	public static int count;
	WelcomeBean(){
		count++;
		System.out.println("Object created");
	}
	
	public String wish() {
		return "Welcome to BeanFactory";
	}

}
