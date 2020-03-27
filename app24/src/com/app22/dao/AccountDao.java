package com.app22.dao;

import com.app22.dto.Account;

public interface AccountDao {
	
	public String craete(String accNo, String accName, String accType, int balance);
	public String search(String accNo);
	public Account getAccount(String accNo);
	public String update(String accNo, String accName, String accType, int balance);	
	public String delete(String accNo);

}
