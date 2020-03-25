package com.app16.beans;

public class Address {
	
	private String plot_no;
	private String street;
	private String city;
	private String state;
	
	public Address(String plot_no, String street, String city, String state) {
		super();
		this.plot_no = plot_no;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public String toString() {
		return "["+plot_no+","+street+","+city+","+state+"]";
	}
	
}
