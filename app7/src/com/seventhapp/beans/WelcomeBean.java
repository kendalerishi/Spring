package com.seventhapp.beans;

public class WelcomeBean {
	
	static {
		System.out.println("Static block of WelcomeBean");
	}
	public WelcomeBean() {
		System.out.println("WelcomeBean object created.");
	}
	public String sayWelcome() {
		return "Welcome user";
	}

}
