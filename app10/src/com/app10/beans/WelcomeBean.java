package com.app10.beans;

public class WelcomeBean {
	private String wishMessage;
	private String name;
	
	public void init() {
		System.out.println("init() of wishbean");
	}
	
	public void destroy() {
		System.out.println("destroy() of wishbean");
	}

	public String getWishMessage() {
		return wishMessage;
	}

	public void setWishMessage(String wishMessage) {
		this.wishMessage = wishMessage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayWelcome() {
		return wishMessage+" "+name;
	}

}
