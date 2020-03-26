package com.app22.dao;

public interface AccountDao {
	
	public String craete(String accNo, String accName, String accType, int balance);
	public String search(String accNo);
	public String update(String accNo, String accName, String accType, int balance);	
	public String delete(String accNo);

}
