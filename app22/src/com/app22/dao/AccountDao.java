package com.app22.dao;

public interface AccountDao {
	
	public String craeteAccount(String accNo, String accName, String accType, int balance);
	public String searchAccount(String accNo);
	public String updateAccount(String accNo, String accName, String accType, int balance);	
	public String deleteAccount(String accNo);

}
