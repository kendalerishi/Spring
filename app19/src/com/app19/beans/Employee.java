package com.app19.beans;

public class Employee {

	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	
	private Account acc;
	
	public Employee(String eid, String ename, float esal, String eaddr, Account acc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.acc = acc;
	}



	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("Employee Id"+eid);
		System.out.println("Employee Name"+ename);
		System.out.println("Employee Salary"+esal);
		System.out.println("Employee Address"+eaddr);
		System.out.println("Account Details "+acc);
	}
}
