package com.app19.beans;

public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private long balance;
	
	public Account(String accNo, String accName, String accType, long balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.balance = balance;
	}



	public String toString() {
		return "["+"Acc NO: "+accNo+","+"Acc Name: "+accName+","+"Acc Type: "+accType+","+"Balance: "+balance+"]";
	}
}
