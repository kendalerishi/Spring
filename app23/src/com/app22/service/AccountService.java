package com.app22.service;

public interface AccountService {
	
	public String craeteAccount(String accNo, String accName, String accType, int balance);
	public String searchAccount(String accNo);
	public String updateAccount(String accNo, String accName, String accType, int balance);	
	public String deleteAccount(String accNo);	

}
