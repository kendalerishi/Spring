package com.app20.beans;

public class Employee {
	
	private String eid;
	private String ename;
	private float esal;
	
	private Address addr;
	private Account acc;
	
	
	// this part removed for constructor autowire mode
//	public Employee(String eid, String ename, float esal, Address addr, Account acc) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//		this.esal = esal;
//		this.addr = addr;
//		this.acc = acc;
//	}

	public Employee(Address addr, Account acc) {
		super();
		this.addr = addr;
		this.acc = acc;
	}

	/*
	 * public String getEid() { return eid; } public void setEid(String eid) {
	 * this.eid = eid; } public String getEname() { return ename; } public void
	 * setEname(String ename) { this.ename = ename; } public float getEsal() {
	 * return esal; } public void setEsal(float esal) { this.esal = esal; } public
	 * Address getAddr() { return addr; } public void setAddr(Address addr) {
	 * this.addr = addr; } public Account getAcc() { return acc; } public void
	 * setAcc(Account acc) { this.acc = acc; }
	 */
	
	public void getEmpDetails() {
		
		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println("Employee Id     "+eid);
		System.out.println("Employee Name   "+ename);
		System.out.println("Employee Salary "+esal);
		System.out.println("Employee Address Details");
		System.out.println("---------------------------");
		System.out.println("House Number    "+addr.getHno());
		System.out.println("Street          "+addr.getStreet());
		System.out.println("City            "+addr.getCity());
		System.out.println("State           "+addr.getState());
		System.out.println("Country         "+addr.getCountry());
		System.out.println("Employee Account Details");
		System.out.println("---------------------------");
		System.out.println("Account No      "+acc.getAccNo());
		System.out.println("Account Name    "+acc.getAccName());
		System.out.println("Account Type    "+acc.getAccType());
		System.out.println("Account Balance "+acc.getBalance());
	}
	

}
