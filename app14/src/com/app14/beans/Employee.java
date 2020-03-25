package com.app14.beans;

public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	
	public Employee(String eid, String ename, float esal, String eaddr) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
	}
	
	public void getEmpDetails() {
		
		System.out.println("Emp Details : ");
		System.out.println("EMD ID: "+eid);
		System.out.println("EMD NAME: "+ename);
		System.out.println("EMD SAL: "+esal);
		System.out.println("EMD ADDRESS: "+eaddr);
	}
}
